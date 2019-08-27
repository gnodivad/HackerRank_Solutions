import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int offset = 1;
            while (i - offset >= 0 && i + offset < n && s.charAt(i - offset) == s.charAt(i - 1)
                    && s.charAt(i + offset) == s.charAt(i - 1)) {
                offset++;
                count++;
            }

            int repeats = 0;
            while (i + 1 < n && s.charAt(i + 1) == s.charAt(i)) {
                repeats++;
                i++;
            }

            count += repeats * (repeats + 1) / 2;
        }

        return n + count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
