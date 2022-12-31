package OPPS;

public class Abc {
    public static void main(String[] args) {
        Sera s = new Sera();
        // System.out.println(s.color);

    }
}

abstract class Animal {
    abstract void eat();
    String color; 
    Animal() {
        System.out.println("Animal constructor is called..");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eats");
        color = "blac";
    }
    Dog() {
        System.out.println("dog constructor is callec..");
    }
}

class Sera extends Dog {
    void eat() {
        System.out.println("both");
    }
    Sera() {
        System.out.println("sara is called");
    }
}