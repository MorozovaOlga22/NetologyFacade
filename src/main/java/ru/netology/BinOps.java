package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        final int aBinary = Integer.parseInt(a, 2);
        final int bBinary = Integer.parseInt(b, 2);
        final int sum = aBinary + bBinary;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        final int aBinary = Integer.parseInt(a, 2);
        final int bBinary = Integer.parseInt(b, 2);
        final int sum = aBinary * bBinary;
        return Integer.toBinaryString(sum);
    }
}
