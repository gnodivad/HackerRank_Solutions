import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int negativeSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == j && a[i] < 0) {
                    negativeSum++;
                    sum += a[i];
                } else {
                    sum += a[j];
                    if (sum < 0) {
                        negativeSum++;
                    }
                }
            }
        }

        System.out.println(negativeSum);
    }
}
