package problems.arrays;

public class RemoveAllOccurences {

  public int removeElement(int[] nums, int val) {
    int n = nums.length;
    int val_n = 0;
    int temp;
    int index = n-1;
    for(int i=0;i<n;i++){
      if(nums[i]==val){
        val_n++;
      }
    }
    int a = 0;
    while(index>=(n-val_n)){
      if(nums[a]==val && nums[index]!=val){
        temp = nums[a];
        nums[a]=nums[index];
        nums[index]=temp;
        index--;
        a++;
      } else if(nums[a]==val && nums[index] ==val){
        index--;
      } else {
        a++;
      }
    }
    return (n-val_n);
  }
}
