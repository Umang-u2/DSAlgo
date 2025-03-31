package problems.arrays;

public class MountainArray {

  public boolean validMountainArray(int[] arr) {
    if(arr.length<3){
      return false;
    }
    int peaks = 0;
    for(int i=1;i<arr.length-1;i++){
      int curr = arr[i];
      int prev = arr[i-1];
      int next = arr[i+1];
      if(curr == prev || curr==next){
        return false;
      }
      if(prev > curr && next > curr){
        return false;
      }
      if(prev<curr && next<curr){
        peaks++;
        if(peaks > 1){
          return false;
        }
      }
    }
    return peaks==1;
  }
}
