package java101;
// putting wayyy too many comments cuz i'm kinda dumb ngl and need to visualize it
// i also had pretty liberal use of google, because i can recall some basic ideas in python, but can't "translate" them over
public class PracticeProblems { // no voids, cant return those
    static int countOccurrences(int[] arr, int target) { // target is number to count, seen in main
        int count = 0; // start count at 0
        for (int num : arr) { //apply func for each number of array
            if (num == target) {
                count++; // add count by 1 if number == target
            }
        }
        return count; // give main the count
    }

    static void reverseArray(int[] arr) { // void is actually allowed here apparently because the array is actually modified??
        int left = 0; // reading left to right, start at 0
        int right = arr.length - 1; // how many "rights" we have to do
        while (left < right) { // while left index is less than right index
            int temp = arr[left]; // make a temp value to hold left value
            arr[left] = arr[right]; // set left to right
            arr[right] = temp; // set right to the previous left
            left++; // 1 less to go on the left
            right--; // 1 less to go on the right
        }
    }

    static int sumGrid(int[][] grid) {
        int sum = 0; // start at 0, as always
        for (int i = 0; i < grid.length; i++) { // continue until end of grid
            for (int j = 0; j < grid[i].length; j++) { // continue until end of row
                sum += grid[i][j]; // add current value to sum
            }
        }
        return sum;
    }

    static int fib(int n) { // i've done this in python before! Java is sucking the life out of me...
        if (n == 0)
            return 0; // value not covered in loop
        else if (n == 1)
            return 1; // value not covered in loop
        int a = 0; // first fib number
        int b = 1; // second fib number
        for (int i = 2; i <= n; i++) { // start at 2, go until n
            int temp = a + b; // basic fib formula, make temp to hold new fib number
            a = b; // shift a to b
            b = temp; // shift b to new fib number
        }
        return b; // return the nth fib number hopefully

    }
}