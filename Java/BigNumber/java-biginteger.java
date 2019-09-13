import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        BigInteger aBI = new BigInteger(a);
        BigInteger bBI = new BigInteger(b);

        System.out.println(aBI.add(bBI));
        System.out.println(aBI.multiply(bBI));

        scanner.close();
    }
}
