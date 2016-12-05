package controller;

import java.util.List;
import java.util.Scanner;

import main.domain.Membership;
import main.etc.MembershipStatus;
import main.etc.Role;

public class MembershipController {
	private List<Membership> memberships;
	public void addMembership(Membership m){
		if(!m.equals(null)) {
			memberships.add(m);
		}
	}
	public void removeMembership(String name){
		boolean removed = false;
		for (Membership m : memberships) {
			if (m.getName().equals(name)) {
				memberships.remove(m);
				removed = true;
			}
		}
		if(!removed) {
			System.out.println("Invalid name, no membership removed");
		}
	}
	@SuppressWarnings("deprecation")
	public void updateMembership(String name) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < memberships.size(); i++) {
			if(memberships.get(i).getName().equals(name)) {
				System.out.println("Enter attribute to update: ");
				String attribute = sc.nextLine();
				while (!attribute.equalsIgnoreCase("name") || !attribute.equalsIgnoreCase("status") || !attribute.equalsIgnoreCase("start date") || !attribute.equalsIgnoreCase("role") || !attribute.equalsIgnoreCase("expire date")) {
					System.out.println("Invalid input: ");
					attribute = sc.nextLine();
				}
				if (attribute.equalsIgnoreCase("name")) {
					System.out.println("Enter new name: ");
					memberships.get(i).setName(sc.nextLine());
				}
				else if (attribute.equalsIgnoreCase("status")) {
					System.out.println("Enter new status: ");
					String status = sc.nextLine();
					while(status.equalsIgnoreCase("") || status.equalsIgnoreCase("")) {
						System.out.println("Invalid input: ");
						status = sc.nextLine();
					}
					if (status.equalsIgnoreCase("Active")) {
						memberships.get(i).setStatus(MembershipStatus.Active);
					}
					else if (status.equalsIgnoreCase("Cancelled")) {
						memberships.get(i).setStatus(MembershipStatus.Cancelled);
					}
					else if (status.equalsIgnoreCase("Expired")) {
						memberships.get(i).setStatus(MembershipStatus.Expired);
					}
				}
				else if (attribute.equalsIgnoreCase("start date")) {
					System.out.println("Enter month (1-12): ");
					memberships.get(i).getStartDate().setMonth(Integer.parseInt(sc.nextLine()));
					System.out.println("Enter date: (1-31): ");
					memberships.get(i).getStartDate().setDate(Integer.parseInt(sc.nextLine()));
					System.out.println("Enter year (YYYY): ");
					memberships.get(i).getStartDate().setYear(Integer.parseInt(sc.nextLine()));
				}
				else if (attribute.equalsIgnoreCase("role")) {
					System.out.println("Enter new role: ");
					String role = sc.nextLine();
					while (!role.equalsIgnoreCase("user") || !role.equalsIgnoreCase("Employee")) {
						System.out.println("Invalid input: ");
						role = sc.nextLine();
					}
					if (role.equalsIgnoreCase("employee")) {
						memberships.get(i).setRole(Role.Employee);
					}
					else if (role.equalsIgnoreCase("user")) {
						memberships.get(i).setRole(Role.User);
					}
				}
				else if (attribute.equalsIgnoreCase("expire date")) {
					System.out.println("Enter month (1-12): ");
					memberships.get(i).getExpireDate().setMonth(Integer.parseInt(sc.nextLine()));
					System.out.println("Enter date: (1-31): ");
					memberships.get(i).getExpireDate().setDate(Integer.parseInt(sc.nextLine()));
					System.out.println("Enter year (YYYY): ");
					memberships.get(i).getExpireDate().setYear(Integer.parseInt(sc.nextLine()));
				}
			}
				
		}
	}
}
