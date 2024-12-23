import java.util.ArrayList;

public class Person {
    private static ArrayList<Person> persons = new ArrayList<>();

    private String name;
    private ArrayList<String> history;
    public Person(String name, String GroupName) {
        this.name = name;
        this.history = new ArrayList<>();
        history.add(GroupName);
        persons.add(this);
    }
    public String getName() {
        return name;
    }
    public static void showHistory(String string) {
        for(Person p:persons) {
            if(p.name.equals(string)) {
                System.out.print("[");
                for(int i=0; i<p.history.size(); i++) {
                    System.out.print(p.history.get(i));
                    if(i!=p.history.size()-1) System.out.print(" => ");
                }
                System.out.print("]");
            }
        }
    }
    public void changeGroup(String name2) {
        history.add(name2);
    }
}
