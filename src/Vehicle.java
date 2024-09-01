abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double rentalRate;
    int duration;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public double calculateRentalCost(){
        return rentalRate * duration;
    }

    public abstract void setRentalRate(double rentalRate);

    public double getRentalRate(){
        return rentalRate;
    }

    public String getbrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayCost(){
        System.out.println("The cost of renting this vehicle for " + duration + " days is $" + calculateRentalCost());
    }

    public void displayVehicleInfo(){
        System.out.println("This vehicle is the brand: " + brand + ". The model is: " + model +
                ". The year is: " + year +"." );
    }
}