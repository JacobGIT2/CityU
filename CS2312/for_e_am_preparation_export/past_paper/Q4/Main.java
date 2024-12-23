public class Main {
    public static void main(String[] args) {
        Barber b = Barber.getInstance();
        (new CustomerEarly("Mr POON")).call(b);
        (new CustomerEarly("Ms TANG")).call(b);
        (new Customer("Ms WONG")).call(b, 1500);
        (new CustomerEarly("Ms CHAN")).call(b);
        b.list(); //output the customer list   
    }
}