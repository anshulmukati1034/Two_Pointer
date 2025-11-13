import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q16_FourSum {
      public static void threePointer(int[] nums, int f, int target, List<List<Integer>> res) {
        for (int j = f + 1; j < nums.length; j++) {
            if (j > f + 1 && nums[j] == nums[j - 1]) continue; // ✅ fix

            int left = j + 1;
            int right = nums.length - 1;

            while (left < right) {
                long sum = (long) nums[f] + nums[j] + nums[left] + nums[right]; // long to avoid overflow

                if (sum == target) {
                    res.add(Arrays.asList(nums[f], nums[j], nums[left], nums[right]));
                    left++;
                    right--;

                    // avoid duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } 
                else if (sum < target) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // ✅ fix

            threePointer(nums, i, target, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}
