import java.util.ArrayList;
import java.util.List;

public class Meal implements FoodItem {
    private double price; // The base price of the meal
    private List<Object> components; // Use Object to hold any of the Protein, Fat, or Carb

    // Constructor to set the price of the meal and initialize components list
    public Meal(double price) {
        this.price = price;
        this.components = new ArrayList<>();
    }

    // Implementing the cost method from the FoodItem interface
    @Override
    public double cost() {
        return price;
    }

    // Add a dietary component to the meal
    public void addComponent(Object component) {
        components.add(component);
    }

    // Display all components of the meal
    public void displayComponents() {
        for (Object component : components) {
            if (component instanceof Protein) {
                ((Protein) component).eat();
            } else if (component instanceof Carb) {
                ((Carb) component).eat();
            } else if (component instanceof Fat) {
                ((Fat) component).eat();
            }
        }
    }

    // Get all components of the meal for processing or other operations
    public List<Object> getComponents() {
        return components;
    }
}
