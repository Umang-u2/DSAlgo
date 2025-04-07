package datastructures;

import problems.arrays.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstOccurenceOfElement {

  public int getFirstOccurenceOf(int[] arr, int target){
    int low = 0;
    int high = arr.length-1;
    int mid;
    while(low<=high){
      mid = (low+high)/2;
      if(arr[mid]<target){
        low = mid+1;
      } else if(arr[mid]>target){
        high = mid-1;
      } else {
        if(mid == 0 || arr[mid-1]!=arr[mid]){
          return mid;
        } else {
          high = mid-1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) throws IOException {
    int[] arr = ArrayUtils.getArray();
    FirstOccurenceOfElement fo = new FirstOccurenceOfElement();
    System.out.println("Enter the target to be searched:");
    int target = Integer.parseInt(new BufferedReader(
            new InputStreamReader(System.in))
            .readLine());
    int pos = fo.getFirstOccurenceOf(arr,target);
    System.out.println("The first occurence of "+target+" is: "+pos);
  }
}
