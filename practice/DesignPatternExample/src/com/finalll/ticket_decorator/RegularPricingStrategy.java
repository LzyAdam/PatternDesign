package com.finalll.ticket_decorator;

public class RegularPricingStrategy implements PricingStrategy {
    Ticket ticket;
    public double calculatePrice(Ticket ticket) {
        // Regular pricing logic
        return ticket.getPrice();
    }
}
