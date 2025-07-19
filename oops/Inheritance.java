package oops;

class ClgStudent extends Student {
    char grade;

    public String toString() {
        return name + " " + age + " " + grade;
    }
}

class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("Calculating area of the triangle");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // ClgStudent c1 = new ClgStudent();
        // c1.grade = 'A';

        Triangle triangle = new Triangle();
        triangle.area();

        // System.out.println(c1);
    }

}
