package controller;

import java.util.ArrayList;
import java.util.List;

import main.domain.Item;
import main.etc.ItemStatus;

public class ItemController {
	
	List<Item> items;
	
	public ItemController() {
		items = new ArrayList<Item>();
	}
	public ItemController(List<Item> items) {
		this.items = items;
	}
	public void addItem(Item i) {
		if (i != null) {
			items.add(i);
		}
		else 
			throw new IllegalArgumentException("Item cannot be null");
	}
	public void deleteItem(String itemId) {
		boolean removed = false;
		for (Item i : items) {
			if (i.getId().equals(itemId)) {
				items.remove(i);
				removed = true;
			}
		}
		if(!removed) {
			System.out.println("Invalid item ID, nothing was removed.");
		}
	}
	public void viewCheckedOutItems() {
		ArrayList<Item> checkedOutItems = new ArrayList<Item>();
		for (Item i : items) {
			if (i.getStatus() == ItemStatus.CheckedOut) {
				checkedOutItems.add(i);
			}
		}
		if (checkedOutItems.isEmpty()) {
			System.out.println("No checked out items to display");
		}
		else {
			System.out.println("Checked out items:");
			for(Item i : checkedOutItems) {
				i.display();
			}
		}
	}
	public void viewLostItems() {
		ArrayList<Item> lostItems = new ArrayList<Item>();
		for (Item i : items) {
			if (i.getStatus() == ItemStatus.Lost) {
				lostItems.add(i);
			}
		}
		if (lostItems.isEmpty()) {
			System.out.println("No lost items to display");
		}
		else {
			System.out.println("Lost items:");
			for(Item i : lostItems) {
				i.display();
			}
		}
	}
	public void viewAvailableItems() {
		ArrayList<Item> availableItems = new ArrayList<Item>();
		for (Item i : items) {
			if (i.getStatus() == ItemStatus.Available) {
				availableItems.add(i);
			}
		}
		if (availableItems.isEmpty()) {
			System.out.println("No availabe items to display");
		}
		System.out.println("Availablet items:");
		for(Item i : availableItems) {
			i.display();
		}
	}
}
