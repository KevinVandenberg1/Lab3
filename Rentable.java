public class Rentable extends Housing{
    private String LANDLORD_NAME;
    private double BASE_RENT;
    private double CREDIT_SCORE;
    private double RELIABILITY_SCORE;
    private String TENANT;
    private boolean FOR_RENT;

    public Rentable(String landlord, double rent, double credit, String tenant, boolean rentStatus, String address, 
        int rooms, double bedrooms, double bathrooms, boolean hasStudio, int capacity) {
        super(address, rooms, bedrooms, bathrooms, hasStudio, capacity);
        if (credit < 1) {
            throw new ArithmeticException("credit isn't a valid amount");
        }
        this.LANDLORD_NAME = landlord;
        this.BASE_RENT = rent;
        this.CREDIT_SCORE = credit;
        this.RELIABILITY_SCORE = credit;
        this.TENANT = tenant;
        this.FOR_RENT = rentStatus;
    }

    public String getLandlord() {
        return this.LANDLORD_NAME;
    }
    public double getRent() {
        return this.BASE_RENT;
    }
    public String getTenant() {
        return TENANT;
    }
    public boolean rentStatus() {
        return this.FOR_RENT;
    }
    public double getCredit() {
        return this.CREDIT_SCORE;
    }
    


    public void addInfraction() {
        this.RELIABILITY_SCORE = this.RELIABILITY_SCORE + 1;
    }
    public void removeInfraction() {
        if (RELIABILITY_SCORE >=2) {
            this.RELIABILITY_SCORE = this.RELIABILITY_SCORE -1;
        } else {
            this.RELIABILITY_SCORE = 1;
        }
    }
    public double calculatePrice() {
        double price = this.BASE_RENT + ((RELIABILITY_SCORE -1) * 100);
        return price;
    }



    public StringBuffer
}
