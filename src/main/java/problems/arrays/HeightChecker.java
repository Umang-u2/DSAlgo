package problems.arrays;

public class HeightChecker {

  public int heightChecker(int[] heights) {
    int[] checkHeights = new int[heights.length];
    for(int i=0;i<heights.length;i++){
      checkHeights[i] = heights[i];
    }
    int [] expected = sortArray(heights,heights.length);
    int count = 0;
    for(int i=0;i<heights.length;i++){
      if(checkHeights[i] != expected[i]){
        count++;
      }
    }
    return count;
  }

  public static int[] sortArray(int[] expected, int n){
    for(int i=0;i< n-1;i++){
      int min = i;
      for(int j=i+1;j<n;j++){
        if(expected[j]<expected[min]){
          min = j;
        }
      }
      swap(expected,i,min);
    }
    return expected;
  }

  public static void swap(int[] arr,int i,int min){
    int temp;
    temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
  }
}
