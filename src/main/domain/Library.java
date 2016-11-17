package main.domain;

import java.util.HashMap;
import java.util.List;

public class Library {
	private String name, address, phoneNumber;
	private HashMap<Integer, Item> items;
	private List<Membership> memberships;
	
	public Library() {
		name = "NULL";
		address = "NULL";
		phoneNumber = "NULL";
		items = new HashMap<Integer, Item>();
	}
	
	public Library(String n, String add, String phone) {
		name = 	n;
		address = add;
		phoneNumber = phone;
		items = new HashMap<Integer, Item>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public HashMap<Integer, Item> getItems() {
		return items;
	}

	public void setItems(HashMap<Integer, Item> items) {
		this.items = items;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}
	
}
