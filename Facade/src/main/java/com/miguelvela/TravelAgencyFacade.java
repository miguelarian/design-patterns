package com.miguelvela;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TravelAgencyFacade {

    private List<Trip> trips = new ArrayList<>();

    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public TravelAgencyFacade() {
        flightBooking = new FlightBooking();
        hotelBooking = new HotelBooking();
        carRental = new CarRental();
    }

    public Trip bookTrip() {
        UUID flightBookingId = flightBooking.bookFlight();
        UUID hotelBookingId = hotelBooking.bookHotel();
        UUID carBookingId = carRental.rentCar();

        Trip trip = new Trip(flightBookingId, hotelBookingId, carBookingId);
        trips.add(trip);
        return trip;
    }
}
