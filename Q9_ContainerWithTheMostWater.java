public class Q9_ContainerWithTheMostWater {
     public static int maxArea(int[] height) {
      int i=0,j=height.length-1;
      int maxSum=0;

        while(i<j){
            int lambai=Math.min(height[i],height[j]) * (j-i);
            maxSum=Math.max(lambai,maxSum);

            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
