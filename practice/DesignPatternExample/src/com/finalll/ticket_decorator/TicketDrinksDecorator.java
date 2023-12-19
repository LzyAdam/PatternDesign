package com.finalll.ticket_decorator;

public  class TicketDrinksDecorator extends Ticket {
    Ticket ticket;


    public TicketDrinksDecorator(Ticket ticket) {
       this.ticket=ticket;
    }

    @Override
    public double getPrice() {
        return ticket.getPrice()+8;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Coke has already been added to your ticket: 8 ");
    }
}
