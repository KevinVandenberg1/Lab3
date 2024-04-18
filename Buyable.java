public class Buyable extends Housing {
    private double PRICE;
    private Boolean FOR_SALE;
    private String OWNER;

    public Buyable(String address, int price, boolean forSale, String owner, 
                int rooms, int bedrooms, int bathrooms, boolean studio, int capacity) {
        super(address, rooms, bedrooms, bathrooms, studio, capacity);
        if (price < 0) {
            throw new ArithmeticException("Price isn't a valid input");
        }
        this.PRICE = price;
        this.FOR_SALE = forSale;
        if (owner == null) {
            this.OWNER = "None";
        } else {
            this.OWNER = owner;
        }
    }

    public boolean saleStatus() {
        return this.FOR_SALE;
    }
    public double getPrice() {
        return this.PRICE;
    }
    public String getOwner() {
        return this.OWNER;
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
