package datastructures;

import problems.arrays.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastOccurenceOfElement {

  public int getLastOccurenceOf(int[] arr, int target){
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
        if(mid == arr.length-1 || arr[mid]!=arr[mid+1]){
          return mid;
        } else {
          low = mid+1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) throws IOException {
    int[] arr = ArrayUtils.getArray();
    LastOccurenceOfElement lo = new LastOccurenceOfElement();
    System.out.println("Enter the target to be searched:");
    int target = Integer.parseInt(new BufferedReader(
            new InputStreamReader(System.in))
            .readLine());
    int pos = lo.getLastOccurenceOf(arr,target);
    System.out.println("The last occurence of "+target+" is: "+pos);
  }
}
