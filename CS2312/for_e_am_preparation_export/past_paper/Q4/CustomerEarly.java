public class CustomerEarly extends Customer {
    public CustomerEarly(String name) {
        super(name);
    }
    public void call(Barber b) {
        int time = b.getEarliestTime();
        setServiceTime(time);
        b.markTime(this, time);
    }
}
