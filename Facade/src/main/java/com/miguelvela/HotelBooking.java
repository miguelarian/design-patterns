package com.miguelvela;

import java.util.UUID;

public class HotelBooking {
    public UUID bookHotel() {
        UUID hotelBookingId = UUID.randomUUID();
        System.out.println("Hotel booked: " + hotelBookingId);
        return hotelBookingId;
    }
}
