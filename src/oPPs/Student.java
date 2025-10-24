package oPPs;

public class Student {
    String name;
    int age;
    String course;

    Student(){
        this("unknown", 0);
    }

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentDetails();

        Student s2 = new Student("dev",23);
        s2.studentDetails();

        s2.sey(s2);
    }

    void studentDetails(){
        System.out.println("name"+name + "age"+ age);
    }
    void sey(Student s){
        System.out.println("good moring"+s.name );
    }
}
