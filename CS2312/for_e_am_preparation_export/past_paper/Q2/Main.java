public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(new Simple());
        counter1.tick(); //Output: Increment = 1,  result = 1
        counter1.tick(); //Output: Increment = 1,  result = 2
        counter1.tick(); //Output: Increment = 1,  result = 3
        counter1.tick(); //Output: Increment = 1,  result = 4
        counter1.tick(); //Output: Increment = 1,  result = 5
        Counter counter2 = new Counter(new Advanced());
        counter2.tick(); //Output: Increment = 1,  result = 1
        counter2.tick(); //Output: Increment = 2,  result = 3
        counter2.tick(); //Output: Increment = 3,  result = 6
        counter2.tick(); //Output: Increment = 4,  result = 10
        counter2.tick(); //Output: Increment = 5,  result = 15
    }
}