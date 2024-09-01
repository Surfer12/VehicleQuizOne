class Motorcycle extends Vehicle {
    private double engineSize;
    private String type;

    public Motorcycle(String brand, String model, int year, double engineSize, String type,
                      double rentalRate, int duration) {
        super(brand, model, year);
        this.engineSize = engineSize;
        this.type = type;
        this.rentalRate = rentalRate;
        this.duration = duration;
    }
}