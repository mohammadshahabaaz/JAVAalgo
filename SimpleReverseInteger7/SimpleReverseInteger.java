package javaAlgo.SimpleReverseInteger7;

public class SimpleReverseInteger {
    public static int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reversed;
        }
    }

    public static void main(String[] args) {
        int number = 123;
        System.out.println("Reversed integer: " + reverse(number));
    }
}
