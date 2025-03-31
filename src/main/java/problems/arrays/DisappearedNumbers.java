package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

  public List<Integer> findDisappearedNumbers(int[] arr) {
    List<Integer> res = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      int index = Math.abs(arr[i]) - 1;
      arr[index] = Math.abs(arr[index])*-1;
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
        res.add(i+1);
      }
    }
    return res;
  }
}
