import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables. */
        // Note: If you have trouble reading the entire String, please go back and
        // review the Tutorial closely.
        i2 = i + scan.nextInt();
        d2 = d + scan.nextDouble();
        scan.nextLine();
        s2 = s + scan.nextLine();

        System.out.println(i2);
        System.out.println(d2);
        System.out.println(s2);
        scan.close();
    }
}