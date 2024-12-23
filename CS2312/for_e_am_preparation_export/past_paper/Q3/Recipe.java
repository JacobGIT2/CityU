public class Recipe {
    private String name;
    private Cook bestCook;
    private int bestScore;

    public Recipe(String name) {
        this.name = name;
        this.bestCook = null;
        this.bestScore = 0;
    }
    public void update(Cook c, int s) {
        if(s>bestScore) {
            bestCook = c;
            bestScore = s;
        }
    }
    public void report() {
        System.out.print(name+": ");
        if(bestScore == 0) {System.out.println("[No data]");}
        else {
            System.out.print("The best cook is ");
            bestCook.printName();
        }
    }
}
