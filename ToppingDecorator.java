public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem foodItems;

    public ToppingDecorator(FoodItem foodItems) {
        this.foodItems = foodItems;
    }

}