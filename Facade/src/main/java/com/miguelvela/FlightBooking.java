package com.miguelvela;

import java.util.UUID;

public class FlightBooking {
    public UUID bookFlight() {
        UUID flightBookingId = UUID.randomUUID();
        System.out.println("Flight booked: " + flightBookingId);
        return flightBookingId;
    }
}
