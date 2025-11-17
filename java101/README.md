[linked guide](https://sciborgs.github.io/SciGuides/projects/intro-to-programming/Java101/)

test:
convert arrays into readable output
package java101;

public class Main {
 static void printIntArray(int[] arr) {
  String str = "(";
  for (int i = 0; i < arr.length; i++) {
   str += arr[i];
   if (i != arr.length - 1) {
    str += ", ";
   }
  }
  str += ")";
  System.out.println(str);
 }
 
 public static void main(String[] args) {
  int[] arr = {1, 2, 3};
  printIntArray(arr);
 }
}