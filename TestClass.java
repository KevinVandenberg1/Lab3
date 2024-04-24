// Name: Kevin Vandenberg
// Assignment: Lab 3 Employee Hierarchy
// Class : CS 145
// Notice: ChatGPT, W3Schools and GeeksForGeeks have been used as reference


import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the address:");
        String address = scanner.nextLine(); // Gets the address from the user

        System.out.print("Input the number of rooms:"); 
        int rooms = scanner.nextInt(); // Gets the number of rooms from user

        System.out.print("Input the number of bedrooms:");
        double bedrooms = scanner.nextDouble(); // Gets the number of bedrooms from the user

        System.out.print("Input the number of bathrooms:");
        double bathrooms = scanner.nextDouble(); scanner.nextLine(); // Gets the number of bathrooms from the user

        System.out.print("Input the number of people who can live here:");
        int capacity = scanner.nextInt(); scanner.nextLine(); // gets the capacity of the house from the user

        System.out.print("Is there a studio?");
        boolean studio = readBoolean(scanner); // Gets whether or not there is a studio from the user

        System.out.print("Is this house rentable or buyable? ");
        String input = scanner.nextLine().toLowerCase().trim(); // gets whether or not the place is rentable or buyable

            // Checks the input and calls the correct method based on what they input in.
        if (input.startsWith("r")) {
            Rentable type = rentableHouse(scanner, address, rooms, bedrooms, bathrooms, capacity, studio);
            System.out.println(type.toString()); // Prints out the message
        } else if (input.startsWith("b")) {
            Buyable type = buyableHouse(scanner, address, rooms, bedrooms, bathrooms, capacity, studio);
            System.out.println(type.toString()); // Prints out the message
        } else {
            System.out.println("Input not recognized");
        }
        scanner.close(); // Closes the scanner
    }

    // Method for getting the information for a place that is rentable.
    public static Rentable rentableHouse(Scanner scanner, String address, int rooms, 
        double bedrooms, double bathrooms, int capacity, boolean studio) {
        String tenant = null;
        double credit = 1;

        System.out.print("Landlord Name: ");
        String lName = scanner.nextLine();

        System.out.print("Base rent Price: ");
        double rent = scanner.nextDouble(); scanner.nextLine();

        System.out.print("Is it for rent? ");
        Boolean status = readBoolean(scanner);
        if (!status) {
            System.out.print("What is the tenants name? ");
            tenant = scanner.nextLine();

            System.out.print("What is their credit? (1 being good, 5 being bad) ");
            credit = scanner.nextDouble(); scanner.nextLine();
        }
        Rentable house = new Rentable(lName, rent, credit, tenant, status, address, rooms, bedrooms, bathrooms, studio, capacity);
        return house;
    }

    // Method for getting the information for a house that is buyable
    public static Buyable buyableHouse(Scanner scanner, String address, int rooms,
                                        double bedrooms, double bathrooms, int capacity, boolean studio) 
        { String owner = null;
        System.out.print("Input the price of the location:");
        double price = scanner.nextDouble();
        System.out.print("Is it for sale? ");
        Boolean saleStatus = readBoolean(scanner);
        if (!saleStatus) {
            System.out.print("Who is the owner? ");
            owner = scanner.nextLine();
        }
        Buyable house = new Buyable(address, price, saleStatus, owner, rooms, bedrooms, bathrooms, studio, capacity);
        return house;
    }

    // Makes sure the users input either true or false, or yes or no to return a boolean. If not, it lets them try again.
    public static boolean readBoolean(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().toLowerCase();
                if (input.startsWith("t") || input.startsWith("y")) {
                    return true;
                } else if (input.startsWith("f") || input.startsWith("n")) {
                    return false;
                } else {
                    System.out.println("Type T or F (true or false)");
                }
            } catch (Exception e) {
                System.out.println("Type T or F (true or false)");
            }
        }
    }

}
