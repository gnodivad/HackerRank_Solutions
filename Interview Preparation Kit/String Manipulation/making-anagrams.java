import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();

        a.chars().forEachOrdered(i -> mapA.put((char)i, mapA.getOrDefault((char)i, 0) + 1));
        b.chars().forEachOrdered(i -> mapB.put((char)i, mapB.getOrDefault((char)i, 0) + 1));

        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            count += Math.abs(mapA.getOrDefault(c, 0) - mapB.getOrDefault(c, 0));
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
