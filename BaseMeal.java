public class BaseMeal implements FoodItem {
    private double price; // Base price, could be 0 if this class is just a placeholder.

    public BaseMeal(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return price; // Returns the base cost of the meal, which might be zero if it's just a placeholder.
    }
}
