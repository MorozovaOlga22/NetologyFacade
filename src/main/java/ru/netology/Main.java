package ru.netology;

public class Main {
    public static void main(String[] args) {
        final BinOps bins = new BinOps();
        System.out.println(bins.sum("10", "1"));
        System.out.println(bins.sum("11", "1"));
        System.out.println(bins.mult("11", "1"));
        System.out.println(bins.mult("10", "10"));
        System.out.println(bins.mult("11", "11"));
    }
}
