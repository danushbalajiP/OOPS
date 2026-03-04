abstract class Animal {     

    static int count = 0;    

    final void sleep() {     
        System.out.println("Animal is sleeping");
    }

    abstract void sound();   
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class NonAccessTest {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.sleep();

        System.out.println("Count = " + Animal.count);
    }
}