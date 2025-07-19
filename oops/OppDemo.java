package oops;

class Car {
    int wheel;
    String color;

    public Car(){
        System.out.println("default call");
    }

    public Car(Car other) {
        this.wheel = other.wheel;
        this.color = other.color;
    }

    public Car(int wheel, String color) {
        this.color = color;
        this.wheel = wheel;
    }

    void print() {
        System.out.println(wheel);
        System.out.println(color);
    }
}

public class OppDemo {
    public static void main(String[] args) {
        Car myCar = new Car(34, "red");
        myCar.print();
        Car myCar2 = new Car(myCar);
        myCar2.print();
    }
}
