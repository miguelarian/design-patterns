package com.miguelvela;

public class Main {
    public static void main(String[] args) {

        Newsletter jobsPortal = new Newsletter();

        Subscriber recruiter = new Subscriber("Recruiter");
        Subscriber jobSeeker = new Subscriber("Job Seeker");
        Subscriber company = new Subscriber("Company XYZ");

        jobsPortal.subscribe(recruiter);
        jobsPortal.subscribe(jobSeeker);
        jobsPortal.subscribe(company);

        jobsPortal.publish("New vacancy at CoolCompany!");

        jobsPortal.unsubscribe(recruiter);
        jobsPortal.publish("Update for companies and job seekers only!");
    }
}