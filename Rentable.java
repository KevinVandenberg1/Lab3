public class Rentable extends Housing{
    private String landlord;
    private double baseRent;
    private double creditScore;
    private double reliabilityScore;
    private String tenant;
    private boolean forRent;

    public Rentable(String landlord, double rent, double credit, String tenant, boolean rentStatus, String address, 
        int rooms, double bedrooms, double bathrooms, boolean hasStudio, int capacity) {
        super(address, rooms, bedrooms, bathrooms, hasStudio, capacity);
        if (credit < 1) {
            throw new ArithmeticException("credit isn't a valid amount");
        }
        this.landlord = landlord;
        this.baseRent = rent;
        this.creditScore = credit;
        this.reliabilityScore = credit;
        this.tenant = tenant;
        this.forRent = rentStatus;
    }

    public String getLandlord() {
        return this.landlord;
    }
    public double getRent() {
        return this.baseRent;
    }
    public String getTenant() {
        return this.tenant;
    }
    public boolean rentStatus() {
        return this.forRent;
    }
    public double getCredit() {
        return this.creditScore;
    }
    


    public void addInfraction() {
        this.reliabilityScore = this.reliabilityScore + 1;
    }
    public void removeInfraction() {
        if (reliabilityScore >=2) {
            this.reliabilityScore = this.reliabilityScore -1;
        } else {
            this.reliabilityScore = 1;
        }
    }
    public double calculatePrice() {
        double price = this.baseRent + ((reliabilityScore -1) * 100);
        return price;
    }


    @Override
    public String toString() {

        return null;
    }
}
