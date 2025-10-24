package oPPs;

public class TestInheitance {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
    }
}
