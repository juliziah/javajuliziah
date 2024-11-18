import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String model;
    private String make;
    private double price;

    public Car(String model, String make, double price) {
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Make: " + make + ", Price: " + price;
    }
}

class CarManager {
    private List<Car> cars;

    public CarManager() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public double calculateAveragePrice() {
        if (cars.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Car car : cars) {
            total += car.getPrice();
        }
        return total / cars.size();
    }

    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

public class CarSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Make: ");
            String make = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Car car = new Car(model, make, price);
            carManager.addCar(car);
        }

        System.out.println("\nCars entered:");
        carManager.displayCars();

        double averagePrice = carManager.calculateAveragePrice();
        System.out.printf("Average price of the cars: %.2f\n", averagePrice);

        scanner.close();
    }
}