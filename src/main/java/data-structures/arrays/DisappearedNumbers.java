package data;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {

  public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    List<Integer> resList = new ArrayList<>();
    resList = getDisappearingNumbers(arr);
    for(int i : resList){
      System.out.println(i);
    }
  }

  public static List getDisappearingNumbers(int[] arr){
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
