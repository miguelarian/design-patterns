package com.miguelvela;

import java.util.UUID;

public class CarRental {
    public UUID rentCar() {
        UUID carBookingId = UUID.randomUUID();
        System.out.println("Car rented: " + carBookingId);
        return carBookingId;
    }
}
