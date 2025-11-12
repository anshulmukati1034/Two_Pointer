public class Q12_SortColor {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int sl=0,hi=n-1,mid=0;
        while(sl<=hi){
            if(nums[mid]==0){
                swap(nums,sl,mid);
                sl++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,sl,hi);
                hi--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    
    }

    public static void main(String[] args){
        int [] nums={2,0,2,1,1,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
