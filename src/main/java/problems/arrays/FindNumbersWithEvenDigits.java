package problems.arrays;

public class FindNumbersWithEvenDigits {
  public int findNumbers(int[] nums) {
    int evenCount = 0;
    for(int i=0;i<nums.length;i++){
      if((FindNumbersWithEvenDigits.findDigits(nums[i]))%2 == 0){
        evenCount++;
      }
    }
    return evenCount;
  }

  public static int findDigits(int num){
    int digit = 0;
    while(num != 0){
      num = num/10;
      digit++;
    }
    return digit;
  }
}
