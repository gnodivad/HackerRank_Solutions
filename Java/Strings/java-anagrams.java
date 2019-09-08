import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        // Complete the function
        int[] frequencyA = new int[26];
        int[] frequencyB = new int[26];

        for (int i = 0; i < a.length(); i++) {
            frequencyA[Character.toLowerCase(a.charAt(i)) - 'a']++;
            frequencyB[Character.toLowerCase(b.charAt(i)) - 'a']++;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (frequencyA[i] != frequencyB[i]) {
                isAnagram = false;
            }
        }

        return isAnagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
