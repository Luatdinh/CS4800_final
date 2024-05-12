import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<FoodItem> toppings;

    public Menu() {
        this.toppings = new ArrayList<>();
        initializeDefaultToppings();
    }

    private void initializeDefaultToppings() {
        toppings.add(new Tomato(new BaseMeal(0), 1.5)); // BaseMeal is a hypothetical simple meal for topping calculation
        toppings.add(new Pickle(new BaseMeal(0), 1.0));
        toppings.add(new Sauce(new BaseMeal(0), 2.0));
    }

    public void addTopping(FoodItem topping) {
        if (topping != null && !toppings.contains(topping)) {
            toppings.add(topping);
            System.out.println("Topping added: " + topping.getClass().getSimpleName());
        }
    }

    public List<FoodItem> getToppings() {
        return new ArrayList<>(toppings);
    }
}
