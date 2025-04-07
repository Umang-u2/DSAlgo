package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {

  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  /**
   * Reads an integer from the console.
   *
   * @return the integer entered by the user.
   * @throws IOException if an I/O error occurs.
   * @throws NumberFormatException if the input is not a valid integer.
   */
  public static int readInt() throws IOException {
    while (true) {
      try {
        System.out.print("Enter an integer: ");
        return Integer.parseInt(reader.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid integer.");
      }
    }
  }

  /**
   * Reads a string from the console.
   *
   * @return the string entered by the user.
   * @throws IOException if an I/O error occurs.
   */
  public static String readString() throws IOException {
    System.out.print("Enter a string: ");
    return reader.readLine();
  }

  public static int[] readArrayElements() throws IOException {
    System.out.println("Enter the size of the array: ");
    int n= Integer.parseInt(reader.readLine());
    int[] a = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
      a[i] = Integer.parseInt(reader.readLine());
    }
    return a;
  }

  public static void printArrayElement(int a[],int n){
    System.out.println("The elements of the array are: ");
    for (int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  }
}
