/**
 * Represents a service offered by the Car Wash.
 */
public class CarWashService {

    // Instance variable
    private String serviceType;

    /**
     * Constructs a CarWashService with the specified service type.
     * 
     * @param serviceType the type of service offered (e.g., "Basic Wash", "Deluxe Wash")
     */
    public CarWashService(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Gets the type of service offered by the car wash.
     * 
     * @return the service type
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the type of service offered by the car wash.
     * 
     * @param serviceType the service type to set
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * Returns a string representation of the CarWashService object.
     * 
     * @return a string describing the service type
     */
    @Override
    public String toString() {
        return "CarWashService {serviceType='" + serviceType + "'}";
    }
}
