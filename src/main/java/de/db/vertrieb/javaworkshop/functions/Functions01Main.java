package de.db.vertrieb.javaworkshop.functions;

public class Functions01Main {

    public static void main(String[] args) {
        String[] names = {"Felix", "Nicklas", "Eike", "Samuel"};
        sayHelloTo(names);
    }

    private static void sayHelloTo(String[] names){
        for (String name : names){
            System.out.println("Hallo " + name);
        }
    }
}