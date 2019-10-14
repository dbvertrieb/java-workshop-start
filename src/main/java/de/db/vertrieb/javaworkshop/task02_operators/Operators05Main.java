package de.db.vertrieb.javaworkshop.task02_operators;

public class Operators05Main {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a == 1);
        System.out.println(!(a == 1));

        int b = 1;
        System.out.println(b < 3 && b == 1);
        System.out.println(b < 3 && b > 1);

        int c = 1;
        System.out.println(c < 3 || c == 1);
        System.out.println(c < 3 || c > 1);
        System.out.println(c == 3 || c > 1);

        int d = 1;
        System.out.println(d < 3 ^ d == 1);
        System.out.println(d < 3 ^ d > 1);
    }
}