package org.tickets;

public class Ticket {
    // ATTRIBUTES
    private int travelDistance;
    private int passengerAge;
    private static final double PRICE_PER_KM = 0.21;
    private static final double JUNIOR_DISCOUNT = 0.8;
    private static final double SENIOR_DISCOUNT = 0.6;

    // CONSTRUCTORS
    public Ticket(int travelDistance, int passengerAge) throws IllegalArgumentException {
        this.travelDistance = validateTravelDistance(travelDistance);
        this.passengerAge = validatePassengerAge(passengerAge);
    }

    // METHODS
    // Validations
    private int validateTravelDistance(int travelDistance) throws IllegalArgumentException {
        if (travelDistance <= 0) {
            throw new IllegalArgumentException("Travel distance must be a positive integer.");
        }
        return travelDistance;
    }

    private int validatePassengerAge(int passengerAge) throws IllegalArgumentException {
        if (passengerAge <= 0) {
            throw new IllegalArgumentException("Passenger age must be a positive integer.");
        }
        return passengerAge;
    }

    // Other methods
    public double calculatePrice() {
        double basePrice = PRICE_PER_KM * travelDistance;
        double finalPrice = basePrice;

        if (passengerAge < 18) {
            finalPrice = basePrice * JUNIOR_DISCOUNT;
        } else if (passengerAge >= 65) {
            finalPrice = basePrice * SENIOR_DISCOUNT;
        }

        return finalPrice;
    }
}
