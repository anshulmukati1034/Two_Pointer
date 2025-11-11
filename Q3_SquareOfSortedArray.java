public class Q3_SquareOfSortedArray {
     public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];        
        int i = 0, j = n - 1, pos = n - 1;

        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if (left > right) {
                ans[pos] = left;
                i++;
            } else {
                ans[pos] = right;
                j--;
            }
            pos--;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        int ans[]=sortedSquares(nums);

       for(int num:ans){
           System.out.print(num+" ");
       }

    }
}
