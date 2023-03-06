package codewars;

import static java.lang.Integer.parseInt;
import static java.lang.Long.toBinaryString;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse_bits(417));
    }

    public static int reverse_bits(int n) {
        return parseInt(String.valueOf(new StringBuilder(toBinaryString(n)).reverse()), 2);
    }
}
