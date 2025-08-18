package firstprogra.com.hello;

public class test1 {
    public static void main(String[] args) {

//        // 🔹 Two ways to create string (2 tarike se string ban sakti hai)
//        // 1. Using new keyword (heap memory, naya object banega)
//        String address = new String("India");
//
//        // 2. Using string literal (string pool me store hoti hai)
//        String name = "Dev Bhai";
//
//        // 🔹 Difference between "==" and equals()
//        // "==" sirf reference (address) compare karta hai, value nahi.
//        String a = new String("ram");  // Heap me new object
//        String b = new String("ram");  // Dusra alag object banega
//        System.out.println(a == b);   // false (kyunki address alag h)
//
//        // String pool concept
//        String x = "ram";
//        String y = "ram";   // same location use karega, pool me
//        System.out.println(x == y);   // true (kyunki value pool me ek hi h)
//
//        // 🔹 String Methods
//
//        String fullName = "Akshit Sharma"; // Index hamesha 0 se start hota h
//        System.out.println(fullName.length());   // 13
//        System.out.println(fullName.charAt(0));  // A
//        System.out.println(fullName.charAt(2));  // k
//
//        // equals() vs equalsIgnoreCase()
//        String n1 = "Akshit";
//        String n2 = "akshit";
//        System.out.println(n1.equals(n2));           // false (case sensitive)
//        System.out.println(n1.equalsIgnoreCase(n2)); // true (case ignore karega)
//
//        // compareTo() -> lexicographical comparison (ASCII values)
//        String str1 = "remote";
//        String str2 = "car";
//        int cmp = str1.compareTo(str2);
//        System.out.println(cmp); // positive, negative ya 0 return karega
//
//        // substring()
//        String myName = "Dev Pratap";
//        String sub = myName.substring(0, 3); // index 0,1,2
//        System.out.println(sub); // Dev
//
//        // 🔹 More methods
//        String str = "   Dev Pratap   ";
//        System.out.println(str.toUpperCase());      // "   DEV PRATAP   "
//        System.out.println(str.toLowerCase());      // "   dev pratap   "
//        System.out.println(str.trim());             // "Dev Pratap" (extra space hat gyi)
//        System.out.println(str.replace("Dev", "Manoj")); // "   Manoj Pratap   "
//
//        // contains(), startsWith(), endsWith()
//        System.out.println(myName.contains("Pratap")); // true
//        System.out.println(myName.startsWith("Dev"));  // true
//        System.out.println(myName.endsWith("Pratap")); // true
//
//        // isEmpty() vs isBlank()
//        String empty = "";
//        String space = "   ";
//        System.out.println(empty.isEmpty()); // true
//        System.out.println(space.isEmpty()); // false
//        System.out.println(space.isBlank()); // true
//
//        // indexOf() and lastIndexOf()
//        String student = "Aman Panchal";
//        System.out.println(student.indexOf("A"));      // 0 (first A)
//        System.out.println(student.lastIndexOf("A"));  // 5 (last A)
//
//        // Convert number to string
//        int num = 10;
//        String s = String.valueOf(num);
//        System.out.println(s);  // "10"
//
//        // String formatting
//        String formattedStr = String.format("My name is %s and I am %d years old", "John", 25);
//        System.out.println(formattedStr);
//
//        // substring vs subSequence
//        System.out.println(student.substring(2, 8));   // "an Pan"
//        System.out.println(student.subSequence(2, 8)); // "an Pan" (almost same)
    }
}
