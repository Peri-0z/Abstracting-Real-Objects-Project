/**
 * Tester class for the CarWash and CarWashService classes.
 * Demonstrates the creation of CarWash objects using different constructors,
 * the use of behavior methods, and the printing of object details.
 * Also demonstrates the creation and use of CarWashService objects.
 */
public class TesterCarWash {
    public static void main(String[] args) {
        // Create a CarWash object using the default constructor
        CarWash carWash1 = new CarWash();
        System.out.println("Car Wash 1 (Default Constructor):");
        System.out.println(carWash1);

        // Call a behavior method with parameters on carWash1
        carWash1.boostRating(2.0);
        System.out.println("\nCar Wash 1 After Boosting Fame Rating:");
        System.out.println(carWash1);

        // Call a behavior method without parameters on carWash1
        carWash1.upgradeEquipment();
        System.out.println("\nCar Wash 1 After Upgrading Equipment:");
        System.out.println(carWash1);

        // Create a CarWashService object for carWash1
        CarWashService service1 = new CarWashService("Basic Wash");
        System.out.println("\nCar Wash 1 Service:");
        System.out.println(service1);

        // Create a CarWash object using the overloaded constructor
        CarWash carWash2 = new CarWash(4.5, 85.0, "Uptown", "Alice Johnson");
        System.out.println("\nCar Wash 2 (Overloaded Constructor):");
        System.out.println(carWash2);

        // Call a behavior method with parameters on carWash2
        carWash2.transferOwnership("Bob Smith");
        System.out.println("\nCar Wash 2 After Transferring Ownership:");
        System.out.println(carWash2);

        // Call a behavior method without parameters on carWash2
        carWash2.resetRating();
        System.out.println("\nCar Wash 2 After Resetting Fame Rating:");
        System.out.println(carWash2);

        // Create a CarWashService object for carWash2
        CarWashService service2 = new CarWashService("Deluxe Wash");
        System.out.println("\nCar Wash 2 Service:");
        System.out.println(service2);

        // Update the service type for service2
        service2.setServiceType("Premium Wash");
        System.out.println("\nCar Wash 2 Updated Service:");
        System.out.println(service2);
    }
}
