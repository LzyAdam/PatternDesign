package com.finalll.ticket_decorator;

public class VIPPricingStrategy implements PricingStrategy {
    Ticket ticket;
    public double calculatePrice(Ticket ticket) {
        // Regular pricing logic
        return ticket.getPrice()*1.5;
    }
}
