package problems.arrays;

import java.io.IOException;

public class KadaneAlgorithm {

  public int getMaxSum(int[] arr){
    int currSum = 0;
    int maxSum = 0;
    for(int i=0;i<arr.length;i++){
      currSum+=arr[i];
      maxSum = Math.max(currSum,maxSum);
      if(currSum<0)
        currSum = 0;
    }
    return maxSum;
  }

  public static void main(String[] args) throws IOException {

    int arr[] = ArrayUtils.getArray();
    KadaneAlgorithm kd = new KadaneAlgorithm();
    int maxSum = kd.getMaxSum(arr);
    System.out.println("The maximum sum of subsets is: "+maxSum);
  }
}
