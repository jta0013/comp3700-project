package main.domain;

import java.util.Date;
import java.util.Scanner;

import main.etc.ItemStatus;

public class Magazine extends Item {
	private Date publish_date;
	public Magazine(String title, Date publish_date) {
		super(title);
		this.publish_date = publish_date;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	@Override
	public void updateItem() {
		System.out.println("Choose attribute to update: ");
		Scanner sc = new Scanner(System.in);
		String attribute = sc.nextLine();
		while (!attribute.equalsIgnoreCase("title") || !attribute.equalsIgnoreCase("status") || !attribute.equalsIgnoreCase("publisher") || !attribute.equalsIgnoreCase("publish date")) {
			System.out.println("Invalid input: ");
			attribute = sc.nextLine();
		}
		int attributeIndex = 0;
		if (attribute.equalsIgnoreCase("title")) {
			attributeIndex = 1;
		}
		else if (attribute.equalsIgnoreCase("status")) {
			attributeIndex = 2;
		}
		else if (attribute.equalsIgnoreCase("publish date")) {
			attributeIndex = 3;
		}

		switch(attributeIndex) {
		case 1:
			System.out.println("Enter new title: ");
			this.setTitle(sc.nextLine());
			break;
		case 2: {
			System.out.println("Enter new status: ");
			String status = sc.nextLine();
			while (!status.equalsIgnoreCase("available") || !status.equalsIgnoreCase("checked out") || !status.equalsIgnoreCase("lost")) {
				System.out.println("Invalid input: ");
				status = sc.nextLine();
			}
			if (status.equalsIgnoreCase("available")) {
				this.setStatus(ItemStatus.Available);
			}
				
			else  if (status.equalsIgnoreCase("checked out")) {
				this.setStatus(ItemStatus.CheckedOut);
			}
			else if (status.equalsIgnoreCase("lost")) {
				this.setStatus(ItemStatus.Lost);
			}
			break;
		}
		case 3:
			System.out.println("Enter month (1-12): ");
			this.publish_date.setMonth(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter date: (1-31): ");
			this.publish_date.setDate(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter year (YYYY): ");
			this.publish_date.setYear(Integer.parseInt(sc.nextLine()));
			break;
		}
	}
}
