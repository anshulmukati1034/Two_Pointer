import java.util.Arrays;

public class Q14_3SumClosest {
     public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2]; // initial guess

        for (int f = 0; f < nums.length - 2; f++) {
            int i = f + 1;
            int j = nums.length - 1;

            while (i < j) {
                int sum = nums[f] + nums[i] + nums[j];

                // update closest sum if this one is nearer to target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else {
                    // exact match found
                    return sum;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args){
        int [] nums={-1,2,1,-4};
        int target=1;
        int result=threeSumClosest(nums,target);
        System.out.println("The sum that is closest to the target " + target + " is: " + result);
    }
}
