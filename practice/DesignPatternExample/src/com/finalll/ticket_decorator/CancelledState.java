package com.finalll.ticket_decorator;

public class CancelledState implements TicketState {
    public void handleState(Ticket ticket) {
        System.out.println("Ticket booking is cancelled.");
        // Additional logic for cancelled state
    }
}


