import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            int answer = number1 / number2;

            System.out.println(answer);
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

