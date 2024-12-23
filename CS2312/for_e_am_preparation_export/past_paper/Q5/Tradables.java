public abstract class Tradables implements Iconsumable {
    private String ID;
    private int price;
    private int Discount;
    public Tradables(String ID, int price, int Discount) {
        this.ID = ID;
        this.price = price;
        this.Discount = Discount;
    }
    public String getID() {return ID;}
    public int getPrice() {return price;}
    public int getDiscountPercent() {return Discount;}
    public void resetDiscount() {Discount = 0;}
    public abstract int getProfit();
    public String toString() {return ID;}
}
