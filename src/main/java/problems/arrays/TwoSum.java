package problems.arrays;

import java.io.IOException;
import java.util.HashMap;

public class TwoSum {

  public int[] twoSum(int[] nums, int target){

    HashMap<Integer,Integer> mapElements = new HashMap<>();

    //fill the hashMap
    for(int i=0;i<nums.length;i++){
      mapElements.put(nums[i],i);
    }

    int[] res= {0,1};
    //Search the hashMap
    for(int i=0;i<nums.length;i++){
      int num = nums[i];
      int rem = target-num;
      if(mapElements.containsKey(rem)){
        int index = mapElements.get(rem);
        if(index == i) continue;
        return new int[]{i,index};
      }
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    int arr[] = ArrayUtils.getArray();
    TwoSum ts = new TwoSum();
    int res[] = ts.twoSum(arr,6);
    ArrayUtils.displayArray(res);
  }
}
