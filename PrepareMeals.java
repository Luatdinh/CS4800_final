public class PrepareMeals implements OrderState {
    @Override
    public void selectDietaryAndTopping(Context context) {
        // Not applicable for this state
    }

    @Override
    public void prepareMeals(Context context) {
        System.out.println("via prepare");
        context.setState(new DeliverMeals());
    }

    @Override
    public void deliverMeals(Context context) {
        // Not applicable for this state
    }
}
