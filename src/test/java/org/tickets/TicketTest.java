package org.tickets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    public void testCalculatePriceNoDiscount() {
        Ticket ticket = new Ticket(100, 30);
        double expectedPrice = 100 * 0.21;
        assertEquals(expectedPrice, ticket.calculatePrice(), 0.0001);
    }

    @Test
    public void testCalculatePriceJuniorDiscount() {
        Ticket ticket = new Ticket(100, 17);
        double expectedPrice = 100 * 0.21 * 0.8;
        assertEquals(expectedPrice, ticket.calculatePrice(), 0.0001);
    }

    @Test
    public void testCalculatePriceSeniorDiscount() {
        Ticket ticket = new Ticket(100, 65);
        double expectedPrice = 100 * 0.21 * 0.6;
        assertEquals(expectedPrice, ticket.calculatePrice(), 0.0001);
    }

    @Test
    public void testNegativeTravelDistance() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-100, 30));
    }

    @Test
    public void testNegativePassengerAge() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -30));
    }

    @Test
    public void testZeroTravelDistance() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 30));
    }

    @Test
    public void testZeroPassengerAge() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, 0));
    }
}