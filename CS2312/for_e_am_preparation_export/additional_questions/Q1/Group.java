import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private String name;
    private ArrayList<Person> members;
    private Person leader;
    public Group(String name, String file) throws FileNotFoundException {
        this.name = name;
        this.members = new ArrayList<>();
        Scanner s = new Scanner(new File(file));
        int size = s.nextInt();
        for(int i=0; i<size; i++) {
            String tempName = s.next();
            members.add(new Person(tempName, name));
        }
        leader = members.get(0);
        s.close();
    }
    public void show() {
        System.out.print("["+name+": ");
        for(int i=0; i<members.size(); i++) {
            if(members.get(i).equals(leader)) {
                System.out.print(leader.getName()+"(leader)");
            }
            else {System.out.print(members.get(i).getName());}
            if(i!=members.size()-1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public boolean existMember(String string) {
        for(Person p:members) {
            if(p.getName().equals(string)) return true;
        }
        return false;
    }
    public static void changeTeam(String string, Group b, Group c) {
        boolean found = false;
        for(Person p:b.members) {
            if(p.getName().equals(string)) {
                if(p.equals(b.leader)) {
                    System.out.println("[No. "+string+" is the leader in "+b.name+".]");
                    found = true;
                }
                else {
                    b.members.remove(p);
                    c.members.add(p);
                    p.changeGroup(c.name);
                    System.out.println("[OK]");
                    found = true;
                }
                break;
            }
        }
        if(!found) System.out.println("[No. "+string+" is not found in "+b.name+".]");
    }
}
