package problems.arrays;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    if(nums.length == 1){
      return;
    }else {
      int read = 0;
      for(int i = 0; i<nums.length;i++){
        if(nums[i] != 0){
          nums[read] = nums[i];
          read++;
        }
      }
      for(int i=read;i<nums.length;i++){
        nums[i] = 0;
      }
    }
  }
}
