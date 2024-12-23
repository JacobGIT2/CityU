public class Counter {
    private int count=0;
    private Controller k;
    public Counter(Controller k) {this.k=k;}
    public void tick() {k.tick(this);}
    public void increment(int incr) {
        count+=incr;
        System.out.printf("Increment = %d,  result = %d\n",
    incr, count);
    }
}