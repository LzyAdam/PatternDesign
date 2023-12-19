package com.finalll.ticket_decorator;

public class AvailableState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket is available for booking.");
        // Additional logic for available state
    }
}


