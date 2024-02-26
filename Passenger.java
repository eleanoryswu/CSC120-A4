
public class Passenger {
    private String name;
  
    /**
     * Constructs a Passenger with the given name.
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the passenger.
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

     /**
     * Boards a car in the train.
     * @param car The car to board.
     * @return True if boarding is successful, false otherwise.
     */
    public void boardCar(Car car) {
        if (car.addPassenger(this)) {
            System.out.println(name + " boarded the car.");
        } else {
            System.out.println("Car is full. " + name + " couldn't board.");
        }
    }

     /**
     * Gets off from a car in the train.
     * @param car The car to get off from.
     * @return True if getting off is successful, false otherwise.
     */
    public void getOffCar(Car car) {
        if (car.removePassenger(this)) {
            System.out.println(name + " got off the car.");
        } else {
            System.out.println(name + " wasn't aboard the car.");
        }
    }
}
