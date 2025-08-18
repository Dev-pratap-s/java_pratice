package firstprogra.com.hello;

public class test2 {
    public static void main(String[] args) {

        // ---------------- RELATIONAL OPERATORS ----------------
        // < , > , <= , >= , == , !=
        // -> Ye do values ko compare krte hain aur hamesha boolean (true/false) return krte hain.
        /*
        int a = 1;
        int b = 2;
        boolean c = a < b;     // true
        System.out.println(c);
        */


        // ---------------- LOGICAL OPERATORS ----------------
        // && (Logical AND)  -> dono condition true honi chahiye
        // || (Logical OR)   -> koi ek condition true honi chahiye
        // !  (Logical NOT)  -> true ko false aur false ko true bana deta hai

        // Example 1: AND operator
        /*
        int ramMarks = 35;
        int ramAge = 50;
        System.out.println(ramMarks >= 33 && ramAge <= 18); // false
        */

        // Example 2: OR operator
        /*
        String name1 = "ram";
        int exp = 2;
        boolean tier1 = true;

        boolean cond1 = exp >= 5;
        System.out.println(tier1 || cond1); // true (kyunki tier1 true hai)
        */


        // ---------------- CONDITIONAL STATEMENTS ----------------
        // if - else
        /*
        int age = 2;
        if(age > 18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a child");
        }
        */

        // Example 2: multiple conditions
        // -> agar koi ek condition true ho gayi to niche wali conditions check nahi hongi
        /*
        int age = 50;
        int marks = 35;

        if(age > 20 || marks >= 33){
            System.out.println("Congratulations!");
        }
        else{
            System.out.println("Better luck next time!");
        }
        */


        // ---------------- SWITCH CASE ----------------
        // switch me hum ek variable dete hain
        // uske value ke hisaab se matching case execute hota hai
        // Supported types: byte, short, char, int, String, enum
        /*
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        */

        //  Loops - for, while, do-while loops

    }
}
