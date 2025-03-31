package problems.arrays;

public class RemoveDuplicatesFromSorted {

  public int removeDuplicates(int[] nums) {
    int i=0;
    int j=1;
    int count = 0;
    int temp;
    while(j<nums.length){
      if(nums[j] == nums[i]){
        count++;
        j++;
      } else if(nums[j]!=nums[i]){
        temp = nums[j];
        nums[j]=nums[i+1];
        nums[i+1]=temp;
        i++;
        j++;
      }
    }
    return(nums.length-count);
  }
}
