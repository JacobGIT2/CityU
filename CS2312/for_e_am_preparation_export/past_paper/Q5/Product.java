public class Product extends Tradables {
    public Product(String id, int price) {
        super(id, price, 10);
        if(price<50) super.resetDiscount();
    }
    @Override
    public int getProfit() {
        return (int)(0.1*super.getPrice());
    }
}
