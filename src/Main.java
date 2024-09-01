
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 4, 5, 50.0, 3);
        Vehicle truck = new Truck("Ford", "F-150", 2020, 1000.0, 6.5, 100.0, 5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2020, 883.0, "Cruiser", 75.0, 7);

        car.displayCost();
        truck.displayCost();
        motorcycle.displayCost();

        car.setRentalRate(60.0);
        truck.setRentalRate(120.0);
        motorcycle.setRentalRate(80.0);

        car.displayVehicleInfo();
        truck.displayVehicleInfo();
        motorcycle.displayVehicleInfo();
    }
}