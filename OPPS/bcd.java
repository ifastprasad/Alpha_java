package OPPS;

public class bcd {

    
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        // Bear b = new Bear();
        // b.eat();
        // b.sleep();

        // Student s1 = new Student();
        // s1.setName("krishna");
        // s1.setRoll(3);
        // Student.setSchoolNmae("Abhigayan public Scahool");

        // System.out.println(Student.getSchoolNmae());

        // Student s2 = new Student();
        // s2.name = "prasad";
        // System.out.println(s2.getName());
        // System.out.println(s2.getSchoolNmae());

        WallPen wp = new WallPen();
        System.out.println(wp.gitTip());

        wp.setTip(9);

        System.out.println(wp.gitTip());

        
    

    }
}

interface ChaessPlyer { 
    void moves();
}

class Queen implements ChaessPlyer {
     public void moves() {
        System.out.println("up , down left right, dignol (int all 4 direction)");
     }
}

class Rook implements ChaessPlyer {
    public void moves () {
        System.out.println("up down left right");
    }
}

class King implements ChaessPlyer {
    public void moves() {
        System.out.println(" up , down , left , right , diagonl (by 1 step)");
    }
}

// example of multimple inheriatance

interface Herbivore {
    default void eat() {
        System.out.println("eat meant");
    }

    default void sleep() {
        System.out.println("sleeps");
    }
}

interface Carbivore {
    default void eat() {
        System.out.println("eat meat");
    }
}

class Bear implements Herbivore, Carbivore {
    

    public void eat() {
        System.out.println("eat boht");
    }
}

class Student {
    String name;
    int roll;
    static String schoolNmae;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public static void setSchoolNmae(String schoolNmae) {
        Student.schoolNmae = schoolNmae;
    }

    public static String getSchoolNmae() {
        return schoolNmae;
    }
}

class Pen {
    String color;
    int tip; 
    Pen() {
        System.out.println(" Pen Constructor is called");
    }
}

class WallPen extends Pen {
    void setTip(int tip) {
        super.tip = tip;
    }

    int gitTip() {  
        return super.tip;
    }
    WallPen() {
        super();
        System.out.println("Constructor is called..");
    }

}


