/**
 * Represents a Car Wash with various attributes such as size, capacity, fame,
 * efficiency, location, and ownership.
 */
public class CarWash {

    // Instance variables
    private String size;
    private int capacity;
    private double fame;
    private double efficiency;
    private String location;
    private String ownedBy;

    // Overloaded constructors.
    /**
     * Default constructor for the CarWash class.
     * Initializes the car wash with default values.
     */
    public CarWash() {
        this.size = "Medium";
        this.capacity = 20;
        this.fame = 3.0;
        this.efficiency = 75.0;
        this.location = "Unknown";
        this.ownedBy = "Not Assigned";
    }

    /**
     * Overloaded constructor for the CarWash class.
     * Allows initialization of the car wash with specific values for fame, efficiency,
     * location, and ownership, while using default values for size and capacity.
     * 
     * @param fame      the fame rating of the car wash
     * @param efficiency the efficiency of the car wash
     * @param location   the location of the car wash
     * @param ownedBy    the owner of the car wash
     */
    public CarWash(double fame, double efficiency, String location, String ownedBy) {
        this.size = "Medium"; // Default value
        this.capacity = 20;   // Default value
        this.fame = fame;
        this.efficiency = efficiency;
        this.location = location;
        this.ownedBy = ownedBy;
    }

    // Getters and setters.

    /**
     * Gets the size of the car wash.
     * 
     * @return the size of the car wash
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the car wash.
     * 
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets the capacity of the car wash.
     * 
     * @return the capacity of the car wash
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the car wash.
     * 
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the fame of the car wash.
     * 
     * @return the fame of the car wash
     */
    public double getFame() {
        return fame;
    }

    /**
     * Sets the fame of the car wash.
     * 
     * @param fame the fame to set
     */
    public void setFame(double fame) {
        this.fame = fame;
    }

    /**
     * Gets the efficiency of the car wash.
     * 
     * @return the efficiency of the car wash
     */
    public double getEfficiency() {
        return efficiency;
    }

    /**
     * Sets the efficiency of the car wash.
     * 
     * @param efficiency the efficiency to set
     */
    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    /**
     * Gets the location of the car wash.
     * 
     * @return the location of the car wash
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the car wash.
     * 
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the owner of the car wash.
     * 
     * @return the owner of the car wash
     */
    public String getOwnedBy() {
        return ownedBy;
    }

    /**
     * Sets the owner of the car wash.
     * 
     * @param ownedBy the owner to set
     */
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

     /**
     * Transfers ownership of the car wash to a new owner.
     * 
     * @param newOwner the name of the new owner
     */
    public void transferOwnership(String newOwner) {
        this.ownedBy = newOwner;
    }

    /**
     * Boosts the fame rating of the car wash by a specified amount.
     * 
     * @param increase the amount to increase the fame rating by
     */
    public void boostRating(double increase) {
        this.fame += increase;
    }

    /**
     * Resets the fame rating of the car wash to 0.
     */
    public void resetRating() {
        this.fame = 0;
    }

    /**
     * Upgrades the equipment of the car wash, increasing efficiency and capacity.
     * Efficiency is increased by 15% of its current value, and capacity is
     * increased by 5.
     */
    public void upgradeEquipment() {
        this.efficiency += this.efficiency * 0.15;
        this.capacity += 5;
    }

        /**
     * Returns a string representation of the CarWash object, including all its attributes.
     * 
     * @return a string representation of the CarWash object
     */
    @Override
    public String toString() {
        return "CarWash {" +
                "size='" + size + '\'' +
                ", capacity=" + capacity +
                ", fame=" + fame +
                ", efficiency=" + efficiency +
                ", location='" + location + '\'' +
                ", ownedBy='" + ownedBy + '\'' +
                '}';
    }
}
