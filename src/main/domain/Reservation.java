package main.domain;

import java.util.Date;
import java.util.List;

import main.etc.ReservationStatus;

public class Reservation {
	private ReservationStatus status;
	private Date reservedDate;
	private Date dueDate;
	private List<String> notes;
	private Item item;
	private int memberId;
	
	public Reservation(Date reservedDate, Date dueDate, Item item, int memberId) {
		this.reservedDate = reservedDate;
		this.dueDate = dueDate;
		this.item = item;
		this.status = ReservationStatus.CheckedOut;
		this.memberId = memberId;
	}
	
	public ReservationStatus getStatus() {
		return status;
	}
	public void setStatus(ReservationStatus status) {
		this.status = status;
	}
	public Date getReservedDate() {
		return reservedDate;
	}
	public void setReservedDate(Date reserved_date) {
		this.reservedDate = reserved_date;
	}
	public List<String> getNotes() {
		return notes;
	}
	public void setNotes(List<String> notes) {
		this.notes = notes;
	}
	public void addNote(String note) {
		if(note.isEmpty()) {
			throw new IllegalArgumentException("Note cannot be empty!");
		}
		notes.add(note);	
	}
	public void removeNote(int index) {
		if(index > notes.size()) {
			throw new IllegalArgumentException("Index cannot exceed number of notes!");
		}
		notes.remove(index);
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
}
