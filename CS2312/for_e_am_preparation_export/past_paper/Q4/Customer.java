public class Customer { 
    private String name;
    private int serviceTime;
    public Customer(String name) {
     this.name = name;
    }
    @Override
    public String toString() {
     return this.name + " (" + this.serviceTime + ")";
    }
    public void call(Barber b, int t) {
     serviceTime = t;
     b.markTime(this, t);
    }
    
    protected void setServiceTime(int t) {
     serviceTime = t;   
    }
}