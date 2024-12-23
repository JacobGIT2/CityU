public class Barber {
    private Customer[] cList = new Customer[6]; //Java: each slot is null by default
    private int Atime = 1100;
    private static Barber instance = new Barber();
    public static Barber getInstance() {return instance;}
    private Barber() {}
    public void list() {
        for(Customer c:cList) {
            if(c!=null) System.out.println(c);
        }
    }
    public int getEarliestTime() {
        return Atime;
    }
    public void markTime(Customer c, int t) {
        int idx = (t-1000)/100-1;
        cList[idx] = c;
        if(t==Atime) {
            for(int i=idx+1; i<6; i++) {
                if(cList[i]==null) {
                    Atime = (i+1)*100+1000;
                    break;
                }
            }
        }
    }
}
