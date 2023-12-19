package com.finalll.ticket_decorator;

public  class TicketPopCornDecorator extends Ticket {
    Ticket ticket;


    public TicketPopCornDecorator(Ticket ticket) {
       this.ticket=ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice()+6;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("PopCorn has already been added to your ticket;6 ");
    }
}
