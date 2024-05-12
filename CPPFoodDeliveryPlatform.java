import java.util.ArrayList;
import java.util.List;

public class CPPFoodDeliveryPlatform {
    private List<Restaurant> restaurants;
    private List<Driver> drivers;
    private List<Customer> customers;

    private OrderState state;


    // Constructor to initialize lists for restaurants, drivers, and customers
    public CPPFoodDeliveryPlatform() {
        restaurants = new ArrayList<>();
        drivers = new ArrayList<>();
        customers = new ArrayList<>();
    }

    // Getter for the list of restaurants
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    // Getter for the list of drivers
    public List<Driver> getDrivers() {
        return drivers;
    }

    // Getter for the list of customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Method to register a restaurant on the platform
    public void registerRestaurant(Restaurant restaurant) {
        if (restaurant != null && !restaurants.contains(restaurant)) {
            restaurants.add(restaurant);
            System.out.println("Restaurant registered: " + restaurant.getName());
        } else {
            System.out.println("Failed to register restaurant: Restaurant already registered or null.");
        }
    }

    // Method to register a driver on the platform
    public void registerDriver(Driver driver) {
        if (driver != null && !drivers.contains(driver)) {
            drivers.add(driver);
            System.out.println("Driver registered: " + driver.getName());
        } else {
            System.out.println("Failed to register driver: Driver already registered or null.");
        }
    }

    // Method to register a customer on the platform
    public void registerCustomer(Customer customer) {
        if (customer != null && !customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Customer registered: " + customer.getName());
        } else {
            System.out.println("Failed to register customer: Customer already registered or null.");
        }
    }

    // Constructor to initialize the context with an initial state
    public Context(OrderState initialState) {
        this.state = initialState;
        if (state != null) {
            System.out.println("Initial State set to: " + state.getClass().getSimpleName());
        }
    }

    public void setState(OrderState newState) {
        if (newState == null) {
            this.state = null;
        } else {
            this.state = newState;
        }
    }

    // Method to process the selection of dietary and topping options
    public void processSelectDietaryAndTopping() {
        if (state != null) {
            state.selectDietaryAndTopping(this);
        } else {
            System.out.println("No state is set to process dietary and topping selections.");
        }
    }

    // Method to process the preparation of meals
    public void processPrepareMeals() {
        if (state != null) {
            state.prepareMeals(this);
        } else {
            System.out.println("No state is set to process meal preparation.");
        }
    }

    // Method to process the delivery of meals
    public void processDeliverMeals() {
        if (state != null) {
            state.deliverMeals(this);
        } else {
            System.out.println("No state is set to process meal delivery.");
        }
    }
}
