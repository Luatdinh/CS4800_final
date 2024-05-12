public class SelectDietaryAndTopping implements OrderState {
    @Override
    public void selectDietaryAndTopping(Context context) {
        System.out.println("via select");
        context.setState(new PrepareMeals());
    }

    @Override
    public void prepareMeals(Context context) {
        // Not applicable for this state
    }

    @Override
    public void deliverMeals(Context context) {
        // Not applicable for this state
    }
}
