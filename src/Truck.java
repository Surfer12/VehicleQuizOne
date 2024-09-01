class Truck extends Vehicle {
    private double cargoCapacity;
    private double bedLength;
    private double rentalRate;

    public Truck(String brand, String model, int year, double cargoCapacity, double bedLength,
                 double rentalRate, int duration) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
        this.bedLength = bedLength;
        this.rentalRate = rentalRate;
        this.duration = duration;
    }

    @Override
    public double calculateRentalCost() {
        return rentalRate * duration;
    }

    @Override
    public void setRentalRate(double rentalRate) {

    }
}