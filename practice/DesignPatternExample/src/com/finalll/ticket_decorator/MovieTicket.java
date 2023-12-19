package com.finalll.ticket_decorator;

public class MovieTicket extends Ticket {
    public MovieTicket(String title, String eventDate, double price) {
        super(title, eventDate, price);
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Movie Ticket: " + getTitle() + " on " + getEventDate() + " for $" + getPrice());
    }
}

