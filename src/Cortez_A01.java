
import java.util.Scanner;

public class Cortez_A01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // the following creates new objects for the car information, parking location, hours, and the officer's information
        
        Car info = new Car("CarMake", "CarColor", 0);
        aCar print = new aCar(scanner, info);

        Parking location = new Parking("location", 0);
        aParking display = new aParking(scanner, location);

        Hours parked = new Hours(0);
        overHours show = new overHours(scanner, parked);

        CitationOfficer officer = new CitationOfficer("first", "middle", "last", 0);
        Officer is = new Officer(scanner, officer);

        // the following prints the parking ticket with all of the stored variables in both the enumerated classes and from Scanner
        
        System.out.println("--------------- PARKING TICKET ---------------");
        System.out.println("\nMake: " + print.CarInfo.getMake() + "\nColor: " + print.CarInfo.getColor() + "\nYear: " + print.CarInfo.getYear());
        System.out.println("\nParking Location: " + display.ParkingInfo.getLocation() + "\nNumber of hours overparked: " + show.HoursInfo.getHours());
        System.out.println("\nOfficer name: " + is.OfficerInfo.getFirst() + " " + is.OfficerInfo.getMiddle() + " " + is.OfficerInfo.getLast() + "\nOfficer badge number: " + is.OfficerInfo.getBadge());

        int parkingChoice = (display.ParkingInfo.getChoice());
        int total = 0;

        switch (parkingChoice) {
            case 1:
                total = 25 + ((show.HoursInfo.getHours() - 1) * 10);
                System.out.println("\n" + display.ParkingInfo.getLocation() + " Parking Rate: $25 first hour, \n$10 per additional hour. Total is $" + total + ".");
                break;
            case 2:
                total = 75 + ((show.HoursInfo.getHours() - 1) * 50);
                System.out.println("\n" + display.ParkingInfo.getLocation() + " Parking Rate: $75 first hour, \n$50 per additional hour. Total is $" + total + ".");
                break;
            case 3:
                total = 150 + ((show.HoursInfo.getHours() - 1) * 100);
                System.out.println("\n" + display.ParkingInfo.getLocation() + " Parking Rate: $150 first hour, \n$100 per additional hour. Total is $" + total + ".");
                break;
        }
        System.out.println("\n-----------------------------------------------");
    }
}

// Joseph Cortez 
// Assignment 01: this assignment uses enumerated and aggregation classes to store the information for
// a car make, color, year, hours, location, the citation officer's full name as well as their badge
// number, and prints the information along with the calculation as a formatted parking ticket.