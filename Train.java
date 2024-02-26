import java.util.ArrayList;

/**
 * Represents a train with locomotive engine, cars, and passengers.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

     /**
     * Constructs a Train with the given engine, number of cars, and passenger capacity per car.
     * @param fuelType The fuel type of the engine.
     * @param fuelCapacity The maximum fuel capacity of the engine.
     * @param nCars The number of cars in the train.
     * @param passengerCapacity The passenger capacity per car.
     */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

     /**
     * Gets the engine of the train.
     * @return The engine of the train.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Gets the car at the specified index.
     * @param index The index of the car.
     * @return The car at the specified index.
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

     /**
     * Gets the maximum total capacity across all cars in the train.
     * @return The maximum total capacity across all cars in the train.
     */
    public int getMaxCapacity() {
        int totalCapacity = 0;
        for (Car car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

      /**
     * Gets the number of remaining open seats across all cars in the train.
     * @return The number of remaining open seats across all cars in the train.
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

     /**
     * Prints a roster of all passengers onboard the train.
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + " passengers:");
            cars.get(i).printManifest();
        }
    }
}
