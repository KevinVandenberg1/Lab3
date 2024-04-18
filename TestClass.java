import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the address:");
        String address = scanner.nextLine();
        System.out.print("Input the number of rooms:");
        int rooms = scanner.nextInt();
        System.out.print("Input the number of bedrooms:");
        double bedrooms = scanner.nextDouble();
        System.out.print("Input the number of bathrooms:");
        double bathrooms = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Input the number of people who can live here:");
        int capacity = scanner.nextInt(); scanner.nextLine();
        System.out.print("Is there a studio?");
        boolean studio = readBoolean(scanner);
        System.out.print("Is this house rentable or buyable? ");
        String input = scanner.nextLine().toLowerCase();
        if (input.startsWith("r")) {
            Rentable type = rentableHouse(scanner, address, rooms, bedrooms, bathrooms, capacity, studio);
            System.out.println(type.toString());
        } else if (input.startsWith("b")) {
            Buyable type = buyableHouse(scanner, address, rooms, bedrooms, bathrooms, capacity, studio);
            System.out.println(type.toString());
        } else {
            
        }


        scanner.close();
    }
    public static Rentable rentableHouse(Scanner scanner, String address, int rooms, 
        double bedrooms, double bathrooms, int capacity, boolean studio) {
        String tenant = null;
        double credit = 1;

        System.out.print("Landlord Name: ");
        String lName = scanner.nextLine();

        System.out.print("Base rent Price: ");
        double rent = scanner.nextInt(); scanner.nextLine();

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


    public static boolean readBoolean(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().toLowerCase();
                if (input.startsWith("t") || input.startsWith("y")) {
                    return true;
                } else if (input.startsWith("f") || input.startsWith("n")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Type T or F (true or false)");
            }
        }
    }

}
