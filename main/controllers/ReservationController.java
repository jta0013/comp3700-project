package main.controllers;

import java.util.List; 
import java.util.Scanner; 

import main.domain.Reservation;
import main.etc.ReservationStatus; 
import main.domain.Item; 
import main.etc.Role; 

public class ReservationController {
  private List <Reservation> reservations; 
  
  
  public void createReservation(Reservation r){ 
    if (!r.equals(null) && !r.getStatus().equals(Overdue)) { 
      reservations.add(r);
      r.setStatus(CheckedOut); 
    }
  }
  
  
  public void removeReservation(String memberId, Item item){
	boolean removed = false; 
    for (Reservation r: reservations){ 
      if(r.getMemberId().equals(memberId) && r.getItem().equals(item)){
      	reservations.remove(r);
        r.setStatus(Returned); 
      }
         
    }
    if(!removed) {
   		System.out.println("No reservation found.");
    }
   
  }
}
