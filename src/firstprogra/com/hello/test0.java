package firstprogra.com.hello;


public class test0 {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        System.out.println(args[0]);  // command line argument

        // Topic 1 - Integral numbers
        // byte
        // short
        // int
        // long

        // Topic 2 - Decimal numbers
        // float
        // double

        // Topic 3 - Characters
        // char

        // Topic 4 - Booleans
        // boolean


//        byte age1 = 127;   // max 127 tak store kar sakta hai, 128 doge to error aayega. Uske liye short/int use karna padega
//        short age2 = 32767;
//        int age = -2147483648;
//        long age3 = 2147483647L; // 'L' lagana zaroori hai kyunki default me int le leta hai

//        System.out.println(Byte.MAX_VALUE);  // Byte wrapper class ka max value (127)
//        System.out.println(Byte.MIN_VALUE);  // Byte wrapper class ka min value (-128)
//
//        System.out.println(Short.MAX_VALUE);  // Short wrapper class max value
//        System.out.println(Short.MIN_VALUE);  // Short wrapper class min value
//
//        System.out.println(Integer.MAX_VALUE);  // Integer wrapper class max value
//        System.out.println(Integer.MIN_VALUE);  // Integer wrapper class min value


        // Topic 2 - Decimal numbers
        // float  → chote decimal numbers ke liye
        // double → bade decimal numbers ke liye

//        float mySalary = 1000.11123112121f;   // float ke liye 'f' lagana zaroori hai (7 digits tak accurate)
//        double mySalary2 = 1000.11112311212121;  // double ~15 digits tak accurate
//
//        System.out.println("mySalary = " + mySalary);
//        System.out.println("mySalary2 = " + mySalary2);


        // Topic 3 - Characters
        // char  → sirf single character store karta hai, jaise 'a', '#', '2'

//        char initial = 'a';
//        System.out.println(initial);

//        System.out.println((int) 'a');  // output: 97 (ASCII value)

//        System.out.println((int) Character.MIN_VALUE); // char min value
//        System.out.println((int) Character.MAX_VALUE); // char max value (0 to 65535)

//        System.out.println((char) 10084);  // ❤ number ko char me convert kiya

//        char heart = '\u2764';  // Unicode hex code
//        System.out.println(heart);

//        for(int i = 0; i < 128; i++){
//            System.out.print((char) i);  // ASCII values 0-127 print karega
//        }


        // Topic 4 - Booleans
        // boolean → sirf true/false

//        boolean isAge = false;
//        System.out.println(isAge);


        // -------- Type Conversion --------
        // 1. Widening (automatic) - small box → big box
        // 2. Narrowing (explicit) - big box → small box

//        int a = 10;
//        long b = a;  // int → long (no error, widening)

//        long x = 234;
//        int y = (int) x;  // error avoid karne ke liye cast lagana padega

//        float f = 1.7f;
//        int g = (int) f;
//        System.out.println(g); // output = 1 (decimal part truncate ho gaya)

// Widening example (automatic):
//        byte byteValue = 10;
//        short shortValue = byteValue;
//        int intValue = shortValue;
//        long longValue = intValue;
//        float floatValue = longValue;
//        double doubleValue = floatValue;
//
//        System.out.println(byteValue);    // 10
//        System.out.println(shortValue);   // 10
//        System.out.println(intValue);     // 10
//        System.out.println(longValue);    // 10
//        System.out.println(floatValue);   // 10.0
//        System.out.println(doubleValue);  // 10.0

// char to int (ASCII value):
//        char ch = 'A';
//        int num = ch;
//        System.out.println(num);  // 65

// Narrowing example (explicit):
//        double doubleValue = 123.456;
//        float floatValue = (float) doubleValue;
//        long longValue = (long) doubleValue;
//        short shortValue = (short) doubleValue;
//
//        System.out.println("doubleValue: " + doubleValue);  // 123.456
//        System.out.println("floatValue: " + floatValue);    // 123.456
//        System.out.println("longValue: " + longValue);      // 123
//        System.out.println("shortValue: " + shortValue);    // 123


        // ✅ Variable banate time yaad rakhne wale points:

// 1. Case Sensitive
//    Example: name, Name, NAME → sab alag-alag variables hai

// 2. Valid Starting Character
//    - Digit (0-9) se start NHI kar sakte
//    - Start kar sakte ho: alphabet (a-z, A-Z), underscore (_), dollar ($)

// 3. Keywords Use Nahi Karna
//    Example: public, static, int, class etc. variable name ke liye invalid hai

// 4. Naming Style (camelCase)
//    - Example: myFullName (not myfullname or MyFullName for variables)
//    - Class ke liye PascalCase use hota hai, variables/methods ke liye camelCase

// 5. Meaningful Names
//    - Hamesha aise naam rakho jisse samajh aaye variable kis kaam ka hai
//    Example: age, studentName, totalAmount (not a, b, x1)



        // ✅ Arithmetic Operators in Java

// 1. Addition (+)
//    Example: 10 + 5 = 15

// 2. Subtraction (-)
//    Example: 10 - 5 = 5

// 3. Multiplication (*)
//    Example: 10 * 5 = 50

// 4. Division (/)
//    - Quotient deta hai
//    Example: 10 / 3 = 3   (integer division)
//             10.0 / 3 = 3.333... (decimal)

// 5. Modulus (%)  total divided nhi hota
//    - Remainder deta hai jo naache aata bach kr
//    Example: 10 % 3 = 1
//             15 % 4 = 3

// 6. Increment (++)
//    - Value 1 se badhata hai
//    Example: int a = 5; a++; → a = 6

// 7. Decrement (--)
//    - Value 1 se ghatata hai
//    Example: int a = 5; a--; → a = 4

// 🔥 Note:
// - Pre (++a / --a): pehle value change, fir use hoti
// - Post (a++ / a--): pehle use hoti, fir value change

        //bitwise  oper..
        // operands = byte short int long in pr apply hoga bitwise kyuki demical wale pr apppy nhi hote hai bitwise
        // operator =
        // and - & ,
        // or - |  ,
        // xor- ^ ,
        // not ,
        // left shift <<,
        // right shift >>,
        // unsigned right shift >>>
//        int a =5;
//        System.out.println(Integer.toBinaryString(a)); /// hum 5 ke binary mil jayegi



        /////////  format specifiers
//        2️⃣ %c, %f, %d etc.
//
//        Ye format specifiers hote hain, jo printf me use karte hain output format dene ke liye.
//
//        Examples:
//
//        System.out.printf("Character: %c\n", 'A');   // %c → character
//        System.out.printf("Integer: %d\n", 100);     // %d → integer
//        System.out.printf("Float: %f\n", 12.34);     // %f → floating-point
//        System.out.printf("String: %s\n", "Hello");  // %s → string


/// / string data types kya hote hai
//        Ye sequence of characters ko represent karti hai.  but using doble core " "
//        // string data type nhi hota h ek class hoti h
//        Example: "Hello", "Java123", " " (space bhi string hai).


//        2 way for write
//        String name = "Dev";
//        String city = new String("Aligarh")
        // Immutable ---=
        //Java me strings immutable hote hain → ek baar ban gyi string, usko directly change nahi kar sakte.
        //Agar change karte ho to nayi string memory me ban jati hai.

//        String s = "Hello Java";

//        s.length();        // 10
//        s.toUpperCase();   // "HELLO JAVA"
//        s.toLowerCase();   // "hello java"
//        s.charAt(0);       // 'H'
//        s.substring(0,5);  // "Hello"
//        s.concat(" World");// "Hello Java World"


        //String fname = "Dev";
        //String lname = "Chauhan";
        //String fullName = fname + " " + lname;
        //// "Dev Chauhan"

















    }
}