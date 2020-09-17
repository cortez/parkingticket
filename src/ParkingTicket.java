
import java.util.Scanner;

public class ParkingTicket {
}
    
    // this class initializes the location and input choice variables
class Parking {

    String location;
    int choice;

    public Parking(String location, int choice) {

        this.location = location;
        this.choice = choice;
    }

    public String getLocation() {
        return location;
    }

    public int getChoice() {
        return choice;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}


// this class asks the user to enter and stores the values of regular, premium, and vip parking
class aParking {

    Parking ParkingInfo;

    aParking(Scanner scanner, Parking info) {

        this.ParkingInfo = info;

        System.out.println("Parking Locations:");
        System.out.println(ParkingLocation.Regular.ordinal() + 1 + ": " + ParkingLocation.Regular);
        System.out.println(ParkingLocation.Premium.ordinal() + 1 + ": " + ParkingLocation.Premium);
        System.out.println(ParkingLocation.VIP.ordinal() + 1 + ": " + ParkingLocation.VIP);
        System.out.println("Please enter a make choice between 1 and 3.");

        int locationinput = scanner.nextInt();

        while (locationinput < 1 || locationinput > 4) {
            System.out.println("Error. Please enter a choice between 1 and 3.");
            locationinput = scanner.nextInt();
        }

        switch (locationinput) {
            case 1:
                info.setLocation("Regular");
                break;
            case 2:
                info.setLocation("Premium");
                break;
            case 3:
                info.setLocation("VIP");
                break;
        }
        info.setChoice(locationinput);
    }
}

// this class initializes the hours variable which is used in the next class
class Hours {

    int Hours;

    public Hours(int hours) {

        this.Hours = hours;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }
}

// this class stores the inputted hours
class overHours {

    Hours HoursInfo;

    overHours(Scanner scanner, Hours info) {

        this.HoursInfo = info;

        System.out.println("Please enter the number of hours overparked between 1 and 10000.");

        int hoursinput = scanner.nextInt();

        while (hoursinput < 1 || hoursinput > 10000) {
            System.out.println("Error. Please enter a choice between 1 and 10000.");
            hoursinput = scanner.nextInt();
        }
        info.setHours(hoursinput);
    }
}

