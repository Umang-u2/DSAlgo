package problems.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUtils {

  public static int[] getArray() throws IOException {
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    System.out.println("Enter the length of array: ");
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
      arr[i] = Integer.parseInt(br.readLine());
    }
    return arr;
  }

  public static void displayArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
      System.out.print("-->");
    }
  }
}
