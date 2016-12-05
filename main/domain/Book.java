package main.domain;

import java.util.Scanner;

import main.etc.ItemStatus;

public class Book extends Item {
	private String author;
	private int edition; 
 	public Book(String title, int edition, String author) {
 		super(title); 
 		this.edition = edition;
 		this.author = author;
 	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public void updateItem() {
		System.out.println("Choose attribute to update: ");
		Scanner sc = new Scanner(System.in);
		String attribute = sc.nextLine();
		while (!attribute.equalsIgnoreCase("title") || !attribute.equalsIgnoreCase("status") || !attribute.equalsIgnoreCase("author") || !attribute.equalsIgnoreCase("edition")) {
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
		else if (attribute.equalsIgnoreCase("author")) {
			attributeIndex = 3;
		}
		else if (attribute.equalsIgnoreCase("edition")) {
			attributeIndex = 4;
		}
		switch(attributeIndex) {
		case 1:
			System.out.println("Enter new title: ");
			this.setTitle(sc.nextLine());
			break;
		case 2: {
			System.out.println("Enter new status");
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
			System.out.println("Enter new value for author: ");
			this.setAuthor(sc.nextLine());
			break;
		case 4:
			System.out.println("Enter edition: ");
			this.setEdition(Integer.parseInt(sc.nextLine()));
		}
	}
 	
}
