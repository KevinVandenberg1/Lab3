import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        double price = scanner.nextDouble();
        double rooms = scanner.nextDouble();
        double bedrooms = scanner.nextDouble();
        double bathrooms = scanner.nextDouble(); scanner.nextLine();
        int capacity = scanner.nextInt(); scanner.nextLine();


        scanner.close();
    }
    public static Rentable rentableHouse(Scanner scanner, String address, double price, double rooms, 
                                        double bedrooms, double bathrooms, int capcity) {
        return null;
    }
    public static Buyable buyableHouse(Scanner scanner, String address, double price, double rooms,
                                        double bedrooms, double bathrooms, int capcity) {
        
        return null;
    }


    public static boolean readBoolean(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().toLowerCase();
                if (input.startsWith("t")) {
                    return true;
                } else if (input.startsWith("f")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Type T or F (true or false)");
                scanner.nextLine();
            }
        }
    }

}
