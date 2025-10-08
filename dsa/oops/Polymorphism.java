package oops;

class Student {
    int age;
    String name;

    // 1 entity: display details=> multiple methods with the same name but different
    // parameters
    public void displayDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }

    public void displayDetails(int age) {
        System.out.println("age: " + age);
    }

    public void displayDetails(String name) {
        System.out.println("Name: " + name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 12;
        s1.name = "tusahr";

        Student s2 = new Student();
        s2.age = 23;
        s2.name = "kunal";

        s1.displayDetails(s1.name, s1.age);
        s1.displayDetails(s1.age);
        s1.displayDetails(s1.name);

    }

}
