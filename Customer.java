public class Customer {
    private String name;
    private String address;
    private String county;
    private CPPFoodDeliveryPlatform platform;

    // Constructor to initialize the customer with all necessary attributes
    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    // Method to associate a customer with a delivery platform
    public void setPlatform(CPPFoodDeliveryPlatform platform) {
        this.platform = platform;
    }

    // Method for a customer to select food based on dietary restrictions
    public void selectFood(Menu menu, String dietaryRestriction) {
        System.out.println(this.name + " chooses a meal with a " + dietaryRestriction + " diet.");
        // The platform processes the selection and sets up the order based on dietary needs
        platform.processSelectDietaryAndTopping(menu, dietaryRestriction);
    }

    // Getters and setters for the customer attributes
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
