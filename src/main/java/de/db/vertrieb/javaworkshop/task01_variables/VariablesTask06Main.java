package de.db.vertrieb.javaworkshop.task01_variables;

public class VariablesTask06Main {
    public static void main(String[] args) {
        String welcome = "Willkommen bei DB Vertrieb.";
        System.out.println(welcome);

        String changedWelcome = welcome;
        changedWelcome = "Willkommen bei der DB Systel.";

        System.out.println(welcome);
        System.out.println(changedWelcome);
    }
}
