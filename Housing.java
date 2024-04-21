public class Housing {
    private String address;
    private int totalRooms;
    private double bedrooms;
    private double bathrooms;
    private boolean hasStudio;
    private int capacity;

    public Housing(String address, int rooms, double bedrooms, double bathrooms, boolean studio, int capacity) {
        if (address == null || rooms < 1 || capacity < 1 || bedrooms < 0 || bathrooms < 0) {
            throw new ArithmeticException("Housing must have an address or a room");
        }
        this.address = address;
        this.totalRooms = rooms;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasStudio = studio;
        this.capacity = capacity;
    }
        public String getAddress() {
            return this.address;
        }
        public int getRooms() {
            return this.totalRooms;
        }
        public double getBedrooms() {
            return this.bedrooms;
        }
        public double getBathrooms() {
            return this.bathrooms;
        }
        public boolean hasStudio() {
            return this.hasStudio;
        }
        public int getCapacity() {
            return this.capacity;
        }

        @Override
        public String toString() {
            return String.format("Address: %s%n Total Rooms: %s%n Bedrooms: %s%n Bathrooms: %s%n %s%s%n %s%s%n",
                this.address, this.totalRooms, this.bedrooms, this.bathrooms,
                "Studio:", this.hasStudio, "Capacity:", this.capacity);
            
        }


}