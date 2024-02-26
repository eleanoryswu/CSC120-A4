
public class Engine {
    private FuelType fuelType;
    private double fuelLevel;
    private double maxFuelCapacity;

     /**
     * Constructs an Engine with the given fuel type and maximum fuel level.
     * @param fuelType The type of fuel the engine uses.
     * @param maxFuelLevel The maximum fuel level of the engine.
     */

    public Engine(FuelType fuelType, double maxFuelCapacity) {
        this.fuelType = fuelType;
        this.maxFuelCapacity = maxFuelCapacity;
        this.fuelLevel = maxFuelCapacity;
    }
    /**
     * Refuels the engine, resetting the current fuel level to the maximum.
     */

    public void refuel() {
        fuelLevel = maxFuelCapacity;
    }
    /**
     * Decreases the current fuel level, prints remaining fuel level, and returns true if fuel level is above 0.
     * @return True if fuel level is above 0, false otherwise.
     */
    public boolean go() {
        if (fuelLevel > 0) {
            System.out.println("Choo choo! Remaining fuel level: " + fuelLevel);
            fuelLevel--;
            return true;
        } else {
            System.out.println("Out of fuel.");
            return false;
        }
    }
}