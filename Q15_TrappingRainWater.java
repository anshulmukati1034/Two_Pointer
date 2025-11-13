public class Q15_TrappingRainWater {
     public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left <= right) {
            // update current max values
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            // whichever side is smaller decides water level
            int minHeight = Math.min(leftMax, rightMax);

            // add trapped water = min(leftMax, rightMax) - height[i]
            if (height[left] <= height[right]) {
                water += minHeight - height[left];
                left++;
            } else {
                water += minHeight - height[right];
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height)); // Output → 9
    }
}
