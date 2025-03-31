package data;

import com.util.IOUtil;

import java.io.IOException;

public class SecondLargestElement {

  public static void main(String[] args) throws IOException {
    int[] arr = IOUtil.readArrayElements();
    int max = 0;
    int secMax = -1;
    for(int i=1;i<arr.length;i++){
      if(arr[i]>arr[max]){
        secMax = max;
        max = i;
      } else if(arr[i]!= arr[max] ){
        if(secMax == -1 || arr[i]>arr[secMax]){
          secMax = i;
        }
      }
    }
      System.out.println("The second largest element is: "+arr[secMax]+" at position "+secMax);
  }




}
