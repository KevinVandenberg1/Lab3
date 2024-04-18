public class Housing {
    private String ADDRESS;
    private int TOTAL_ROOMS;
    private double BEDROOMS;
    private double BATHROOMS;
    private boolean HAS_STUDIO;
    private int CAPACITY;

    public Housing(String address, int rooms, double bedrooms, double bathrooms, boolean studio, int capacity) {
        if (address == null || rooms < 1 || capacity < 1 || bedrooms < 0 || bathrooms < 0) {
            throw new ArithmeticException("Housing must have an address or a room");
        }
        this.ADDRESS = address;
        this.TOTAL_ROOMS = rooms;
        this.BEDROOMS = bedrooms;
        this.BATHROOMS = bathrooms;
        this.HAS_STUDIO = studio;
        this.CAPACITY = capacity;
    }
        public String getAddress() {
            return this.ADDRESS;
        }
        public int getRooms() {
            return this.TOTAL_ROOMS;
        }
        public double getBedrooms() {
            return this.BEDROOMS;
        }
        public double getBathrooms() {
            return this.BATHROOMS;
        }
        public boolean hasStudio() {
            return this.HAS_STUDIO;
        }
        public int getCapacity() {
            return this.CAPACITY;
        }

        @Override
        public String toString() {
            return String.format("Address: %s%n Total Rooms: %s%n Bedrooms: %s%n Bathrooms: %s%n %s%s%n %s%s%n",
                this.ADDRESS, this.TOTAL_ROOMS, this.BEDROOMS, this.BATHROOMS,
                "Studio:", this.HAS_STUDIO, "Capacity:", this.CAPACITY);
            
        }


}