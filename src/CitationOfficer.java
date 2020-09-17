
import java.util.Scanner;

//this class initializes the variables for the citation officer which includes the badge number, and first, middle, and last names
class CitationOfficer {

    String first;
    String middle;
    String last;
    int badge;

    public CitationOfficer(String first, String middle, String last, int badge) {

        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public int getBadge() {
        return badge;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }
}

// this class prompts the user to enter and stores the values of the name and badge number mentioned above
class Officer {

    CitationOfficer OfficerInfo;

    Officer(Scanner scanner, CitationOfficer info) {

        this.OfficerInfo = info;
        System.out.println("Please enter the citation officer's first, middle, and last name separated by spaces and between 1 and 100:");

        String firstinput = scanner.next();
        while (firstinput.length() < 1 || firstinput.length() > 100) {
            System.out.println("Error. Please enter a choice between 1 and 3.");
            firstinput = scanner.next();
        }
        info.setFirst(firstinput);

        String middleinput = scanner.next();
        while (middleinput.length() < 1 || middleinput.length() > 100) {
            System.out.println("Error. Please enter a choice between 1 and 3.");
            middleinput = scanner.next();
        }
        info.setMiddle(middleinput);

        String lastinput = scanner.next();
        while (lastinput.length() < 1 || lastinput.length() > 100) {
            System.out.println("Error. Please enter a choice between 1 and 3.");
            lastinput = scanner.next();
        }
        info.setLast(lastinput);

        System.out.println("Please enter citation officer's badge number between 10000 and 99999:");
        int badgeinput = scanner.nextInt();
        while (badgeinput < 10000 || badgeinput > 99999) {
            System.out.println("Error. Please enter a choice between 10000 and 99999.");
            badgeinput = scanner.nextInt();
        }
        info.setBadge(badgeinput);
    }
}
