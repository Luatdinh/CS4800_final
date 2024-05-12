public class DeliverMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(Context context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(Context context) {
        // Not applicable for this state
    }

    @Override
    public void deliverMeals(Context context) {
        context.setState(null);
        System.out.println("Meal delivered, order complete.");
    }
}
