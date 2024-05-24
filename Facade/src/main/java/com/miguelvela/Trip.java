package com.miguelvela;

import java.util.UUID;

public class Trip {
    private UUID id;
    private UUID flightBookingId;
    private UUID hotelBookingId;
    private UUID carBookingId;

    public Trip(UUID flightBookingId, UUID hotelBookingId, UUID carBookingId) {
        this.id = UUID.randomUUID();
        this.flightBookingId = flightBookingId;
        this.hotelBookingId = hotelBookingId;
        this.carBookingId = carBookingId;
    }

    public UUID getId() {
        return id;
    }

    public UUID getFlightBookingId() {
        return flightBookingId;
    }

    public UUID getHotelBookingId() {
        return hotelBookingId;
    }

    public UUID getCarBookingId() {
        return carBookingId;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", flightBookingId=" + flightBookingId +
                ", hotelBookingId=" + hotelBookingId +
                ", carBookingId=" + carBookingId +
                '}';
    }
}
