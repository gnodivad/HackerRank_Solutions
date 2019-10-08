import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bits = scanner.nextInt();
        int operations = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        BitSet bitSet1 = new BitSet(bits);
        BitSet bitSet2 = new BitSet(bits);

        for (int i = 0; i < operations; i++) {
            String[] rowInput = scanner.nextLine().split(" ");

            if (rowInput[0].equals("AND")) {
                if (rowInput[1].equals("1")) {
                    bitSet1.and(bitSet2);
                } else {
                    bitSet2.and(bitSet1);
                }
            } else if (rowInput[0].equals("SET")) {
                int bit = Integer.parseInt(rowInput[2]);
                if (rowInput[1].equals("1")) {
                    bitSet1.set(bit);
                } else {
                    bitSet2.set(bit);
                }
            } else if (rowInput[0].equals("FLIP")) {
                int bit = Integer.parseInt(rowInput[2]);
                if (rowInput[1].equals("1")) {
                    bitSet1.flip(bit);
                } else {
                    bitSet2.flip(bit);
                }
            } else if (rowInput[0].equals("OR")) {
                if (rowInput[1].equals("1")) {
                    bitSet1.or(bitSet2);
                } else {
                    bitSet2.or(bitSet1);
                }
            } else if (rowInput[0].equals("XOR")) {
                if (rowInput[1].equals("1")) {
                    bitSet1.xor(bitSet2);
                } else {
                    bitSet2.xor(bitSet1);
                }
            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
