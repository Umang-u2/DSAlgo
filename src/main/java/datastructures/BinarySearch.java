package datastructures;

import problems.arrays.ArrayUtils;
import util.IOUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

  public int binarySearch(int[] arr, int target){
    int low = 0;
    int high = arr.length-1;
    int mid;
    while(low <= high){
      mid = (low+high)/2;
      if(arr[mid]<target){
        low = mid+1;
      } else if(arr[mid] > target){
        high = high-1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public int binarySearchRecursive(int[] arr,int low, int high, int target){
    if(low>high){
      return -1;
    }
    int mid = (low+high)/2;
    if(arr[mid]==target){
      return mid;
    } else if(arr[mid]<target){
      return binarySearchRecursive(arr, mid+1,high,target);
    } else {
      return binarySearchRecursive(arr,low,mid-1,target);
    }
  }

  public static void main(String[] args) throws IOException {
    int[] arr = ArrayUtils.getArray();
    BinarySearch bs = new BinarySearch();
    System.out.println("Enter the target to be searched:");
    int target = Integer.parseInt(new BufferedReader (
            new InputStreamReader(System.in))
            .readLine());
    int pos = bs.binarySearch(arr, target);
    int posRec = bs.binarySearchRecursive(arr,0,arr.length-1,target);
    System.out.println("The element was found at position: "+pos+" , The position got from recursive search: "+posRec);
  }
}
