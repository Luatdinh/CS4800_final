import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Restaurant restaurant;
    private Customer customer;
    private List<FoodItem> foodItems;
    private Driver driver;
    private LocalDateTime creationTime;
    private LocalDateTime pickUpTime;
    private LocalDateTime deliveredTime;

    // Constructor to initialize the order with all necessary components
    public Order(Restaurant restaurant, Customer customer, List<FoodItem> foodItems, Driver driver) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.foodItems = foodItems;
        this.driver = driver;
        this.creationTime = LocalDateTime.now();  // Set the creation time at the moment of order creation
    }

    // Getters and setters for the attributes
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalDateTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public LocalDateTime getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(LocalDateTime deliveredTime) {
        this.deliveredTime = deliveredTime;
    }
}
