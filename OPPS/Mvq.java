package OPPS;

public class Mvq {
    public static void main(String arg[]) {
    //     Pen p1 = new Pen("red", 3);
    //     System.out.println(p1.color);
    //     System.out.println(p1.tip);

    //     Student s1 = new Student(); 
    //     s1.name = "Krishna";
    //     s1.age = 18;
    //     s1.roll = 30;
    //     s1.mark[0] = 70;
    //     s1.mark[1] = 99;
    //     s1.mark[2] = 89;

    //     System.out.println(s1.name);
    //     System.out.println(s1.mark[0]);
    //     Student s2 = new Student(s1);
    //     s1.mark[1] = 0;
    //     System.out.println(s2.mark[2]);
    //     System.out.println(s2.mark[1]);

        
        // inheritance

        Dog d = new Dog();
        d.legs = 4;
        d.eat();
        d.skincolor = "black";
        System.out.println(d.skincolor);

    }
}

class Pen {
    String color;
    int tip;
    // This is Shallow copy constructor
    Pen(String color, int tip) {
        this.tip = tip;
        this.color = color;
    }

}

class Student {
    String name;
    int roll;
    int age;
    int mark[];
    Student() {
        mark = new int[3];
        System.out.println("Constructor is colled..");
    }
    // Deep copy
    Student(Student s1) {
        mark = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.age = s1.age;
        for(int i=0; i<mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }
    
}

class Animal {
    String skincolor;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    int legs;

}
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walk..");
    }
}



class Dog extends Mammal {
    String breed;
}

