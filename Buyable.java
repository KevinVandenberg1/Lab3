public class Buyable extends Housing {
    private double price;
    private Boolean forSale;
    private String owner;

    public Buyable(String address, double price, boolean forSale, String owner, 
                int rooms, double bedrooms, double bathrooms, boolean studio, int capacity) {
        super(address, rooms, bedrooms, bathrooms, studio, capacity);
        if (price < 0) {
            throw new ArithmeticException("Price isn't a valid input");
        }
        this.price = price;
        this.forSale = forSale;
        if (owner == null) {
            this.owner = "None";
        } else {
            this.owner = owner;
        }
    }

    public boolean saleStatus() {
        return this.forSale;
    }
    public double getPrice() {
        return this.price;
    }
    public String getOwner() {
        return this.owner;
    }


    @Override
    public String toString() {
        String address = "The address is " + getAddress();
        String status = "Status: For Sale";
        String price = "Price: " + getPrice();
        String owner = "Owner: None";
        if (!saleStatus()) { 
            status = "Status: Sold";
            owner = "Owner:" + getOwner();
        }
        String rooms = "Rooms: " + getRooms();
        String bedrooms = "Bedrooms: " + getBedrooms();
        String bathrooms = "Bathrooms: " + getBathrooms();
        String capacity = "Capacity: " + getCapacity() + " People";

        return String.format("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n", 
            address, status, price, rooms, bedrooms, bathrooms, owner, capacity);
    }


}
