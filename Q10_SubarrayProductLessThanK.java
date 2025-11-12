public class Q10_SubarrayProductLessThanK {
     public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
         if (k <= 1) return 0; 

        int prod = 1;
        int i = 0;
        int count = 0;

        for (int j = 0; j < n; j++) {
            prod *= nums[j];

            while (prod >= k && i <= j) {
                prod /= nums[i];
                i++;
            }

            count += (j - i + 1);
        }

        return count;
    }

    public static void main(String[] args){
        int [] nums={10,5,2,6};
        int k=100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
