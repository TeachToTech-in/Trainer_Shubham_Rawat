
public class Demo {
    public static void main(String[] args) {

        Student st1 = new Student(1, "shikhar", "CS"); // constructor
        Student st2 = new Student(2, "naitik");
        st1.display();
        System.out.println("--------------------");
        st2.display();
        Student.hi();
    }

    static {
        System.out.println("hi from static block");
    }

}

class Student {
    int roll;
    String name;
    static String course;

    static void hi() {
        System.out.println("HI how are u");
    }

    static {
        System.out.println("static Block Here!");
    }

    void display() {
        System.out.println(roll + "\n" + name + "\n" + course);
    }

    Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}
