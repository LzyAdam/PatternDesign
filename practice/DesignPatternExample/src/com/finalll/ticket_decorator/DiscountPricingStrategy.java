package com.finalll.ticket_decorator;

public class DiscountPricingStrategy implements PricingStrategy{
    Ticket ticket;
    public double calculatePrice(Ticket ticket) {
        // Regular pricing logic
        return ticket.getPrice()*0.8;
    }
}
