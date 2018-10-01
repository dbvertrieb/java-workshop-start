package de.db.vertrieb.javaworkshop.functions;

public class Functions02Main {

    public static void main(String[] args) {
        int sum = sumUp(4, 9);
        System.out.println(sum);

        System.out.println(sumUp(8, 8));
    }

    private static int sumUp(int a, int b){
        return a + b;
    }
}