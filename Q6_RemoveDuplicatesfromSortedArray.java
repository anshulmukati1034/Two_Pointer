public class Q6_RemoveDuplicatesfromSortedArray {

    public static int removeDuplicate(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }        
        return j;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k=removeDuplicate(nums);
        System.out.println("The length of the array after removing duplicates is: " + k);
        System.out.print("The modified array is: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}