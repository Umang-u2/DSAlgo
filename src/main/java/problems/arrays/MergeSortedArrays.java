package problems.arrays;

public class MergeSortedArrays {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int ra = m-1;
    int rb = n-1;
    int w = m+n-1;
    while(w>=0){
      if(ra >= 0 && rb>=0){
        nums1[w] = nums1[ra]>nums2[rb]?nums1[ra--]:nums2[rb--];
      } else if(ra>=0) {
        nums1[w] = nums1[ra--];
      } else {
        nums1[w] = nums2[rb--];
      }
      w--;
    }
  }
}
