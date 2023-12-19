package com.finalll.ticket_decorator;

public interface PricingStrategy {
    double calculatePrice(Ticket ticket);
}
