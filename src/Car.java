
import java.util.Scanner;

//this class initializes the variables for the car make, color, and year
class Car {

    String CarMake;
    String CarColor;
    int Year;

    public Car(String CarMake, String CarColor, int Year) {

        this.CarMake = CarMake;
        this.CarColor = CarColor;
        this.Year = Year;
    }

    public String getMake() {
        return this.CarMake;
    }

    public String getColor() {
        return this.CarColor;
    }

    public int getYear() {
        return this.Year;
    }

    public void setMake(String CarMake) {
        this.CarMake = CarMake;
    }

    public void setColor(String CarColor) {
        this.CarColor = CarColor;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
}

// this class prints the menus and prompts the user to enter the car make, color, and year
class aCar {

    Car CarInfo;

    aCar(Scanner scanner, Car info) {

        this.CarInfo = info;

        System.out.println("Welcome to Joseph Cortez's Parking Fine System. \n");
        System.out.println("Car Makes:");
        System.out.println(CarMake.Ford.ordinal() + 1 + ": " + CarMake.Ford);
        System.out.println(CarMake.Tesla.ordinal() + 1 + ": " + CarMake.Tesla);
        System.out.println(CarMake.Audi.ordinal() + 1 + ": " + CarMake.Audi);
        System.out.println(CarMake.Nissan.ordinal() + 1 + ": " + CarMake.Nissan);
        System.out.println("Please enter a make choice between 1 and 4.");

        int makeinput = scanner.nextInt();

        while (makeinput < 1 || makeinput > 4) {
            System.out.println("Error. Please enter a choice between 1 and 4.");
            makeinput = scanner.nextInt();
        }

        switch (makeinput) {
            case 1:
                info.setMake("Ford");
                break;
            case 2:
                info.setMake("Tesla");
                break;
            case 3:
                info.setMake("Audi");
                break;
            case 4:
                info.setMake("Nissan");
                break;
        }

        System.out.println("Car Colors:");
        System.out.println(CarColor.MidnightBlue.ordinal() + 1 + ": " + CarColor.MidnightBlue);
        System.out.println(CarColor.PearlWhite.ordinal() + 1 + ": " + CarColor.PearlWhite);
        System.out.println(CarColor.SpaceGray.ordinal() + 1 + ": " + CarColor.SpaceGray);
        System.out.println(CarColor.SunsetOrange.ordinal() + 1 + ": " + CarColor.SunsetOrange);
        System.out.println("Please enter a make choice between 1 and 4.");

        int colorinput = scanner.nextInt();

        while (colorinput < 1 || colorinput > 4) {
            System.out.println("Error. Please enter a choice between 1 and 4.");
            colorinput = scanner.nextInt();
        }

        switch (colorinput) {
            case 1:
                info.setColor("MidnightBlue");
                break;
            case 2:
                info.setColor("PearlWhite");
                break;
            case 3:
                info.setColor("SpaceGray");
                break;
            case 4:
                info.setColor("SunsetOrange");
                break;
        }

        System.out.println("Please enter the car year between 2001 and 2020: ");
        int yearinput = scanner.nextInt();
        while (yearinput < 2001 || yearinput > 2020) {
            System.out.println("Error. Please enter a choice between 2001 and 2020.");
            yearinput = scanner.nextInt();
        }
        info.setYear(yearinput);
    }
}
