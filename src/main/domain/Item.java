package main.domain;

import java.util.List;

import main.etc.ItemStatus;

public class Item {
	private String id;
	private String title;
	private ItemStatus status;
	private List<String> notes;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ItemStatus getStatus() {
		return status;
	}
	public void setStatus(ItemStatus status) {
		this.status = status;
	}
	public void addNote(String note) {
		if (note.isEmpty()) {
			throw new IllegalArgumentException("Note cannot be empty!");
		}
	}
	public void removeNote(int index) {
		if (index > notes.size()) {
			throw new IllegalArgumentException("Index cannot exceed number of notes!");
		}
		notes.remove(index);
	}
}
