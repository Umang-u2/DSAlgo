package problems.arrays;

public class DuplicateZeroes {

  public int[] sortedSquares(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int leftPos = 0;
    int rightPos = n-1;
    int index = n-1;
    while (leftPos <= rightPos){

      int left = nums[leftPos] * nums[leftPos];
      int right = nums[rightPos] * nums[rightPos];

      if(left>right){
        res[index] = left;
        leftPos++;
      } else {
        res[index] = right;
        rightPos--;
      }
      index--;
    }
    return res;
  }
}
