import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q5_CountPairsWhoseSumIsLessThanCount{
      public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);

        int i = 0, j = nums.size() - 1;
        int count = 0;

      
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);

            if (sum < target) {
                count += (j - i);
                i++; 
            } else {
                j--; 
            }
        }

        return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1));
        int target = 2;
        int result = countPairs(nums, target);
        System.out.println("Number of pairs whose sum is less than " + target + ": " + result);
    }   
}