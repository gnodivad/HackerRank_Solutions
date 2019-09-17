import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            ArrayList<Integer> inputs = new ArrayList<Integer>();
            for (int j = 0; j < arrRowItems.length; j++) {
                inputs.add(Integer.parseInt(arrRowItems[j]));
            }
            numbers.add(inputs);
        }

        int read = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < read; i++) {
            String[] queries = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int row = Integer.parseInt(queries[0]);
            int column = Integer.parseInt(queries[1]);

            if (row > numbers.size() || column >= numbers.get(row - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(numbers.get(row - 1).get(column));
            }
        }
    }
}
