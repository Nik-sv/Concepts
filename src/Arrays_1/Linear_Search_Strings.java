package Arrays_1;

public class Linear_Search_Strings {

    public static String linearSearch(String[] str, String key) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] == key) {
                // return i;
            }
        }
        return  null;
    }


    public static void main(String[] args) {

        String[] str =  {"Nikhil" ," Prashant" , "Shubham" , "Pushkar" , "Aman" , "Shradha" };
        String key = "Phuhkar";
        String index = linearSearch(str,key);
        if (index == null) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
