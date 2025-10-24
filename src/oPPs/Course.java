package oPPs;

public class Course {
    String name;
    int duration;

    

    Course(String name, int age){
        this.name = name;
        this.duration = age;
        System.out.println("we are leaing "+ name + age);
    }

    public static void main(String[] args) {
        Course c= new Course("DSA",23);
        Course c2 = new Course("Devpos",43);

        System.out.println("kya value hai"+c.name + c.duration);
        System.out.println("kya value hai"+c2.name + c2.duration);
    }
}
