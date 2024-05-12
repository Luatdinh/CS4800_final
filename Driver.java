public class Driver {
    private String name;
    private String address;
    private String operatingCounty;
    private OrderState currentState;

    // Constructor to initialize the driver with all necessary attributes
    public Driver(String name, String address, String operatingCounty) {
        this.name = name;
        this.address = address;
        this.operatingCounty = operatingCounty;
        this.currentState = null;  // Initially, no order state is assigned
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOperatingCounty() {
        return operatingCounty;
    }

    public void setOperatingCounty(String operatingCounty) {
        this.operatingCounty = operatingCounty;
    }

    // Get the current state of the driver
    public OrderState getCurrentState() {
        return currentState;
    }

    // Set the current state of the driver
    public void setCurrentState(OrderState state) {
        this.currentState = state;
        if (state != null) {
            System.out.println("Driver " + name + " state updated to: " + state.getClass().getSimpleName());
        }
    }

    // Method to handle order delivery
   
}
