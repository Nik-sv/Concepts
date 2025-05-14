package Strings;

public class String_Comparision {

    public static void main(String[] args) {
        String str = "Spider";
        String str2 = "Spider";
        String str3 = new String("Spider");

//        if (str == str2) {
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }
//
//        if (str == str3) {
//            System.out.println("Strings are Equals");
//        } else {
//            System.out.println("Strings are not equals");
//        }

        if (str == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equals");
        }

        if (str.equals(str3)) {
            System.out.println("strings are equals");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
