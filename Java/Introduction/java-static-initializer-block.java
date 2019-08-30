import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner scanner = new Scanner(System.in);
    static boolean flag = false;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    static {
        try {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
