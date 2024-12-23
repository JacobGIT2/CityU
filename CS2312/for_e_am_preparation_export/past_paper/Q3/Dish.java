public class Dish {
    private Cook myCook;
    private Recipe myRecipe;
    public Dish(Cook c, Recipe r) {
        myCook = c;
        myRecipe = r;
    }
    public void obtainScore(int score) {
        myCook.addScore(score);
        myRecipe.update(myCook, score);
    }
}
