package de.db.vertrieb.javaworkshop.task03_caseStructures;

import java.util.Scanner;

public class CaseStructures03Main {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int month = new Scanner(System.in).nextInt();

        if (month == 1) {
            System.out.println("Januar");
        } else if (month == 2) {
            System.out.println("Februar");
        } else if (month == 3) {
            System.out.println("März");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("Mai");
        } else if (month == 6) {
            System.out.println("Juni");
        } else if (month == 7) {
            System.out.println("Juli");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("Oktober");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("Dezember");
        } else {
            System.out.println("Die Nummer entspricht keinem Monat.");
        }
    }
}