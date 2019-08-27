import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int min = Collections.min(map.values());
        int max = Collections.max(map.values());

        HashMap<Integer, Integer> occurenceMap = new HashMap<Integer, Integer>();
        for (Integer occurences : map.values()) {
            occurenceMap.put(occurences, occurenceMap.getOrDefault(occurences, 0) + 1);
        }

        return occurenceMap.size() == 1 || (occurenceMap.size() <= 2
                && (occurenceMap.get(min) <= 1 || occurenceMap.get(max) <= 1 && max - min == 1)) ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
