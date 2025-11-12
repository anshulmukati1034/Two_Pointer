public class Q7_TwoSum2 {
      public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while(low <= high){
            if (numbers[low] + numbers[high] == target){
                return new int[]{low+1,high+1};
            } else if (numbers[low] + numbers[high] < target){
                low++;
            } else {
                high--;
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(result[0] + " and " + result[1]);
    }
}
