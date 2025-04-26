package Array_2;

public class Trapping_Rainwater {

    // Function to calculate the total trapped rainwater
    public static int trappedRainwater(int[] height) {

        int n = height.length;

        // Step 1: Calculate left maximum boundary for each element
        int[] leftMax = new int[n];
        leftMax[0] = height[0]; // First element's leftMax is the element itself
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Step 2: Calculate right maximum boundary for each element
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1]; // Last element's rightMax is the element itself
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // Step 3: Calculate trapped water at each index
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level at current index is minimum of leftMax and rightMax
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped water = waterLevel - height at current index
            trappedWater += waterLevel - height[i];
        }
        return trappedWater; // Return total trapped water
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        // Call the function and print the result
        System.out.println(trappedRainwater(height));
    }
}
