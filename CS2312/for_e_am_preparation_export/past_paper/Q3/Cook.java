import java.util.ArrayList;

public class Cook {
    private String name;
    private ArrayList<Integer> scores;
    public Cook(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }    
    public void addScore(int score) {
        scores.add(score);
    }
    public void report() {
        System.out.printf("I got %d scores: ", scores.size());
        for(int s:scores) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public void printName() {System.out.println(name);}
    public Dish cookDish(Recipe r){
        return new Dish(this, r);
    }
}
