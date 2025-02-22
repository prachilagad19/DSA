public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
      int left=0;
      int right= height.length-1;
      int maxA= 0;

      while(left<right){
        int width = right-left;
        int ht = Math.min(height[left],height[right]);
        int area= width*ht;
      maxA = Math.max(area,maxA);
      if(height[left]< height[right]){
        left++ ;
      } else{
        right--;
      }
      }
      return maxA;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(height));
    }
}
