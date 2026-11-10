
class Animal {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("Tommy");

        System.out.println("Name: " + d.getName());
        d.sound();
    }
}