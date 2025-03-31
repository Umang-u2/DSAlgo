package data;

public class CheckMountainArray {

  public static void main(String[] args) {
    int[] arr = {0,1,2,1,2};
    System.out.println(validMountainArray(arr));
  }

  public static boolean validMountainArray(int[] arr) {
    int b = 0;
    int a = 1;
    boolean flag = true;
    if (arr.length < 3) {
      return false;
    } else if (arr.length == 3) {
      if (arr[1] > arr[0] && arr[2] < arr[1]) {
        return true;
      } else {
        return false;
      }
    } else if(arr[1] < arr[0] || arr[arr.length-1]>arr[arr.length-2]) {
      return false;
  } else{
        while (a < arr.length-1) {
          if (arr[a] == arr[b]) {
            System.out.println(flag);
            System.out.println("a=b");
            return false;
          }
          if (arr[a] > arr[b] && flag) {
            System.out.println(flag);
            System.out.println("a>b");
            b++;
            a++;
          } else if (arr[a] < arr[b] && flag) {
            System.out.println("a<b");
            flag = false;
            System.out.println(flag);
            b++;
            a++;
          } else if (arr[a] > arr[b] && flag==false) {
            System.out.println(flag);
            System.out.println("a>b when false");
            return false;
          }
          System.out.println("a: " + a + " b: " + b);
        }
        if (a == arr.length - 1 && flag) {
          return false;
        } else {
          return true;
        }
      }
    }
}
