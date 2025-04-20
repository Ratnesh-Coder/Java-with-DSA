import java.util.*;
public class rainwater_trapping {
    public static int trappedRainwater (int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++) {
            leftMax[i] =Math.max(height[i], leftMax[i-1]);
        }
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]); 
        } 
        int trappedWater = 0;
        for (int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int[] height = new int[10];
            for (int i=0; i<height.length; i++) {
                height[i] = sc.nextInt();
            }
            System.out.println("Trapped water = " + trappedRainwater(height));
        }
        finally {
            sc.close();
        }
    }
}