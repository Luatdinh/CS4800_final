public class Main {
    public static void main(String[] args) {
        // Initialize the platform
        CPPFoodDeliveryPlatform platform = new CPPFoodDeliveryPlatform();

        // Register restaurants
        platform.registerRestaurant(new Restaurant("The Green Bowl", "123 Veggie Road", "Los Angeles", "8 AM - 10 PM", "Vegan"));
        platform.registerRestaurant(new Restaurant("Ocean's Catch", "234 Fish Ave", "San Diego", "10 AM - 8 PM", "Seafood"));
        platform.registerRestaurant(new Restaurant("Steak Paradise", "345 Meat St", "Orange County", "11 AM - 11 PM", "Steakhouse"));
        platform.registerRestaurant(new Restaurant("Pure Pasta", "456 Italian Blvd", "San Bernardino", "9 AM - 9 PM", "Italian"));

        // Register one driver
        platform.registerDriver(new Driver("Driver1", "Main Street 1", "Los Angeles"));

        // Register two customers with different dietary restrictions
        platform.registerCustomer(new Customer("Customer1", "100 First St", "Los Angeles", "Vegan"));
        platform.registerCustomer(new Customer("Customer2", "200 Second St", "San Diego", "Paleo"));

        // Process orders
        for (Customer customer : platform.getCustomers()) {
            // Select a restaurant (randomly for demonstration)
            Restaurant selectedRestaurant = platform.getRestaurants().get((int) (Math.random() * platform.getRestaurants().size()));
            selectedRestaurant.createMealForDiet(customer.getDietaryRestrictions());

            // Get the first meal prepared for the diet
            Meal meal = selectedRestaurant.getMeals().get(0);

            // Apply a topping based on dietary preference
            FoodItem mealWithTopping = (customer.getDietaryRestrictions().equals("Vegan"))
                    ? new Tomato(meal, 1.5) : new Pickle(meal, 1.0);

            // Adding the meal with topping to the menu
            selectedRestaurant.getMenu().addTopping(mealWithTopping);

            // Prepare for delivery
            Context context = new Context(new SelectDietaryAndTopping());
            context.processSelectDietaryAndTopping();
            context.processPrepareMeals();

            // Delivery process
           // Driver driver = platform.getDrivers().get(0);
            context.setState(new DeliverMeals());
            context.processDeliverMeals();

            // Output the result
            //System.out.println("Order for " + customer.getName() + " has been delivered by " + driver.getName());
            System.out.println("Meal details for a " + customer.getDietaryRestrictions() + " diet:");
            meal.displayComponents();  // Displays the components of the meal
            System.out.println("Topping: " + ((ToppingDecorator) mealWithTopping).getClass().getSimpleName() + "\n");
        }
    }
}
