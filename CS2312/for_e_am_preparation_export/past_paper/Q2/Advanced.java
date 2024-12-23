public class Advanced implements Controller {
    private int incr = 1;
    public void tick(Counter c) {
        c.increment(incr);
        incr++;
    }
}
