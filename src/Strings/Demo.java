package Strings;

import java.util.Scanner;

public class Demo {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
//        char arr[] = {'a' , 'b' ,'c' , 'd' , 'e'};
//        String str = "abcd";
//        String str2 = new String("xyz");
//
//        // Strings are IMMUTABLE (Java Strings in c++ somthing different)
//
//        Scanner sc = new Scanner(System.in);
//        String name;
//        // name = sc.next();
//        name = sc.nextLine();
//        System.out.println(name);

//        String fullName = "Spider Man";
//        System.out.println(fullName.length());

        // concatenation
        String FirstName = "Nikhil";
        String lastName = "Tiwari";
        String fullName = FirstName + " " + lastName;
        System.out.println(fullName);

        printLetters(fullName);



     }
}
