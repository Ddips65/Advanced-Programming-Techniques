/**
 * This program defines three methods each method has own significance. 1) find method scan and
 * search array. 2) Sub array method return a[low..high], including both a[low] and a[high]. Note
 * that Don't use Java’s built-in method when creating a subarray. 3) Returns true if s1 is a prefix
 * of s2.
 */
import java.util.Arrays;

public class Hw1 {
  /**
   * This method is to search weather the entered element is present in the int array or not If
   * entered element found from the array then print respected position of it If element does not
   * found then display message element does not exist.
   *
   * @param a int[]
   * @param x int
   */
  public static void find(int[] a, int x) {
    boolean flag = false;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == x) {
        flag = true; // if respected index val and x val match flag set as a true
        // System.out.println(x + " is in " + i);
        System.out.println(x + " is in " + "a[" + i + "]");
      }
    }
    if (flag == false) // flag false means value doesn't exist
    {
      System.out.println(x + " does not exist");
    }
  }

  /**
   * Creates and returns a subarray a[low..high], including both a[low] and a[high].
   *
   * @param a int[]
   * @param low int
   * @param high int
   * @return temp means subarray of the value
   */
  public static int[] subarray(int[] a, int low, int high) {
    int[] temp = new int[high - low + 1];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = a[low + i];
    }
    return temp;
  }

  /**
   * This method receives two strings s1 and s2. Assume that length of s1 <= length of s2. Returns
   * true if s1 is a prefix of s2 else return false.
   *
   * @param s1 String
   * @param s2 String
   * @return
   */
  public static boolean isPrefix(String s1, String s2) {

    char[] ch1 = new char[s1.length()]; // create ch1 array
    // by default it stores internal value like "'\u0000'"

    char[] ch2 = new char[s2.length()]; // create ch2 array
    // by default it stores internal value like "'\u0000'"

    // From the string s1 copy char by char into ch1 array.
    for (int i = 0; i < s1.length(); i++) {
      ch1[i] = s1.charAt(i); // internal val '\u0000' replace by one by one char
    }

    // From the string s2 copy char by char into ch1 array.
    for (int j = 0; j < s2.length(); j++) {
      ch2[j] = s2.charAt(j); // internal val '\u0000' replace by one by one char
    }

    // Below nested loop for comparing ch1 and ch2 array element one by one
    for (int i = 0; i < s2.length(); i++) {
      for (int j = 0; j < s1.length(); j++) {
        if (ch2[i + j] == ch1[j]) {
          // System.out.println(ch2[i + j]);
          if (j == s1.length() - 1) {
            // System.out.println(j);
            return true; // ctl pass to in main mehtod --> if (isPrefix(s1,s2))
          }
        } else {
          break;
        }
      }
    }
    return false; // ctl pass to --> if (isPrefix(s1,s3)) --> condition false go to else section
  }

  /**
   * A main method to run examples.
   *
   * @param args String[]
   */
  public static void main(String[] args) {
    int[] a = {5, 3, 5, 6, 1, 2, 12, 5, 6, 1}; // create int array

    find(a, 5); // invoke find()
    find(a, 10); // invoke find()
    System.out.println();

    int low = 1;
    int high = 6;

    int[] subarray = new int[high - low + 1];
    subarray = subarray(a, low, high); // invoke subarray()
    System.out.println("a[" + low + ".." + high + "] = " + Arrays.toString(subarray));
    System.out.println();

    String s1 = "abc";
    String s2 = "abcde";
    String s3 = "abdef";

    if (isPrefix(s1, s2)) { // invoke isprefix  check prefix of the string
      System.out.println(s1 + " is a prefix of " + s2);
    } else {
      System.out.println(s1 + " is not a prefix of " + s2); // if prefix doesn't match with string
    }

    if (isPrefix(s1, s3)) { // invoke isprefix  check prefix of the string
      System.out.println(s1 + " is a prefix of " + s3);
    } else {
      System.out.println(s1 + " is not a prefix of " + s3); // if prefix doesn't match with string
    }
  }
}

