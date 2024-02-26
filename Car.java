import java.util.ArrayList;
/**
 * Represents a passenger car in a train.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructs a Car with the given maximum capacity.
     * @param maxCapacity The maximum capacity of the car.
     */
    public Car(int maxCapacity) {
        this.passengers = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    /**
     * Gets the maximum capacity of the car.
     * @return The maximum capacity of the car.
     */

    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Gets the number of remaining seats in the car.
     * @return The number of remaining seats in the car.
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

     /**
     * Adds a passenger to the car if there are available seats.
     * @param passenger The passenger to add.
     * @return True if the passenger is successfully added, false otherwise.
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxCapacity) {
            passengers.add(p);
            return true;
        }
        return false;
    }

     /**
     * Removes a passenger from the car if the passenger is onboard.
     * @param passenger The passenger to remove.
     * @return True if the passenger is successfully removed, false otherwise.
     */
    public boolean removePassenger(Passenger p) {
        return passengers.remove(p);
    }

     /**
     * Prints a list of all passengers aboard the car.
     */
    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("Passengers aboard:");
            for (Passenger passenger : passengers) {
                System.out.println(passenger.getName());
            }
        }
    }
}
