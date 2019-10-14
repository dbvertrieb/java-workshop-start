package de.db.vertrieb.javaworkshop.task05_functions;

public class Functions00Main {

    public static void main(String[] args) {
        sayHelloTo("Felix");

        String welcomeText = createWelcomeText("Eike");
        System.out.println(welcomeText);
    }

    private static void sayHelloTo(String name){
        System.out.println("Hallo " + name);
    }

    private static String createWelcomeText(String name){
        return "Hallo " + name + ", willkommen bei der DB Vertrieb.";
    }
}