package data;

import com.util.IOUtil;

import java.io.IOException;

public class FindLargestElement {

  public static void main(String[] args) throws IOException {
    int[] arr= IOUtil.readArrayElements();
    int max = arr[0];
    int pos = 0;
    for(int i=1;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
        pos = i;
      }
    }
    System.out.println("The largest element is: "+max+" which is present at: "+pos+" position");
    IOUtil.printArrayElement(arr, arr.length);
  }
}
