package com.miguelvela;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Pattern: Travel Agency");
        TravelAgencyFacade travelAgencyFacade = new TravelAgencyFacade();
        Trip trip = travelAgencyFacade.bookTrip();
        System.out.println("Trip booked: " + trip);
    }
}