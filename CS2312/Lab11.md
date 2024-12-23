object created in memory != constructor end running

```java
A a; 
a = new E(new D(new B())); 
```

***E's object created first, then E's constructor starts to assign value to E's object***





***let class A's static method to do jobs when handling a list of A objects!!!***

```java
public class Offering {
    ArrayList<Student> students;

    public void listStudents() {
        String line = this.semID + ": ";
        line += Student.getStudentIdList(students);
        System.out.println(line);
    }
}

public class Student {
    public static String getStudentIdList(ArrayList<Student> a) {
        String result = "";
        for(Student s:a) {
            result += s.id + " ";
        }
        return result;
    }
}
```

