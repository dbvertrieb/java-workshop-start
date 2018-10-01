package de.db.vertrieb.javaworkshop.caseStructures;

import java.util.Scanner;

public class CaseStructuresRead01Main {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println(age < 18 ? "minderjährig" : "volljährig");
    }
}