public class Service extends Tradables {
    public Service(String id, int price) {
        super(id, price, 20);
        if(price<100) super.resetDiscount();
    }
    @Override
    public int getProfit() {
        return (int)(0.3*super.getPrice());
    }
}
