public class Shop {
    private String name;
    private Tradables[] goods;
    public Shop(String name, Tradables[] goods) {
        this.name = name;
        this.goods = goods;
    }
    public void processOrder(Customer c, Iconsumable cons) {
        boolean hasGood = false;
        for(Tradables t:goods) {
            if(t.equals((Tradables)cons)) {
                System.out.println("Traded: " + t.getID() + ", Earning: " + t.getProfit());
                hasGood = true;
                break;
            }
        }
        if(!hasGood) System.out.println("Not provided!");
    }
    public String toString() {return name;}
}
