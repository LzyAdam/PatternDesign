package com.finalll.ticket_decorator;

public class BookedState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket has been booked.");
        // Additional logic for booked state
    }
}


