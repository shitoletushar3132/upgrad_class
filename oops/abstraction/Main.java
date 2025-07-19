package oops.abstraction;

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eats meat");
    }
}

class Hr implements Employee {
    String name;

    public void getDetail() {
        System.out.println("Name:");
        System.out.println("Role: ");
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Parent {
    int age = 19;

    Parent() {
        System.out.println("parent");
    }

}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }

    void show() {
        System.out.println(super.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.show();
        d.eat();

        Hr a = new Hr();

        a.setName("tushar");
        a.getDetail();

        Child c = new Child();
        c.show();

    }

}
