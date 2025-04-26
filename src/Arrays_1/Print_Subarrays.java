package Arrays_1;

public class Print_Subarrays {

    public static void printSubarrays(int[] numbers) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {   // yaha pe i + 1 is liye nahi kiya kyuki hame single element wala bhi loop chiye
                int end = j;
                for (int k = start; k <= end; k++) {   // print
                    System.out.print(numbers[k] + " ");   // subarray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays " + ts);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubarrays(numbers);

    }
}