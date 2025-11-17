[linked guide](https://sciborgs.github.io/SciGuides/projects/intro-to-programming/Java101/)

test:

public class Main {
 public static void main(String[] args) {
  int[] arr = new int[100];
  int index = 0;
  while (index < 100) {
   if (index % 2 == 0) {
    arr[index] = 2;
   } else {
    arr[index] = 1;
   }
   index = index + 1;
   System.out.println(arr[index - 1]);
  }
 }
}