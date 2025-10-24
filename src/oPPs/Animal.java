package oPPs;

public class Animal {
    void eat(){
        System.out.println("Animals is eating....");
    }
    void sound(){
        System.out.println("mmmmememmem");
    }
}


class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("bhubhu");
    }
}