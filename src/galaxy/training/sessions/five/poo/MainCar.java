package galaxy.training.sessions.five.poo;

import java.util.ArrayList;
import java.util.List;

/**
 * Practicando POO, Interfaces, instancia de objetos y uso de List
 *
 */
public class MainCar {
    void main(String[] args) {
        this.basicUsage();
        this.withListUsage();
    }

    private void basicUsage() {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setYear(2017);
        car.setColor("White");
        car.setDoors(3);
        System.out.println(car.topic());
        System.out.println(car.car());
        System.out.println("Car Actions");
        car.speed();
        car.brake();
    }

    private void withListUsage() {
        List<Car> cars = new ArrayList<>();
        Car carOne = new Car();
        carOne.add("Chevrolet", 2023, "Black", 5);
        cars.add(carOne);
        Car carTwo = new Car();
        carTwo.add("Ford", 2023, "Purple", 3);
        cars.add(carTwo);
        System.out.println("\n Using List with card object \n");
        cars.forEach(car -> {
            System.out.println(car.car());
        });
    }
}
