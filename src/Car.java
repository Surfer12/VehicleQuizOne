class Car extends Vehicle {
    private int numDoors;
    private int passengerCapacity;


    public Car(String brand, String model, int year, int numDoors, int passengerCapacity,
               double rentalRate, int duration) {
        super(brand, model, year);
        this.numDoors = numDoors;
        this.passengerCapacity = passengerCapacity;
        this.rentalRate = rentalRate;
        this.duration = duration;
    }
}
