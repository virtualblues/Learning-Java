package java101;
// putting wayyy too many comments cuz i'm kinda dumb ngl and need to visualize it
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

    static void reverseArray(int[] arr) {
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

    static void sumGrid(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    static int fib(int n) { // i've done this in python before! Java is sucking the life out of me...
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}