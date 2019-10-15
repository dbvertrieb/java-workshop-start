package de.db.vertrieb.javaworkshop.chapter_06_strings;

public class String12Main {

    public static void main(String[] args) {

        String s = "Wunderauto";

        String t = s.substring(6);
        System.out.println(t);

        String u = "Das ist ein ganz normaler Satz";
        String [] v = u.split("\\s");

        for(int i = 0; i < 6; i++){
            System.out.println(v[i]);
        }
    }

}
