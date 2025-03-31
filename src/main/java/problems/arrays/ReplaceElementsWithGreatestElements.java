package problems.arrays;

public class ReplaceElementsWithGreatestElements {
  public int[] replaceElements(int[] arr) {
    int n = arr.length;
    int lastElement = arr[n-1];
    if(n==1){
      arr[0] = -1;
      return arr;
    }
    if(n==2){
      arr[0] = Math.max(arr[0],arr[1]);
      arr[1] = -1;
    }
    int max = Math.max(arr[n-1],arr[n-2]);
    int next = arr[n-1];
    for(int i=n-3; i>=0;i--){
      max = Math.max(next,max);
      next = arr[i];
      arr[i] = max;
    }
    arr[n-2] = lastElement;
    arr[n-1] = -1;
    return arr;
  }
}
