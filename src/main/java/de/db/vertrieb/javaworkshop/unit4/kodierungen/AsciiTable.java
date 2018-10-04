package de.db.vertrieb.javaworkshop.unit4.kodierungen;

public class AsciiTable {
    public static void main(String[] args) {
        char zeichen;
        for(int i = 0; i<1048; i++) {
            zeichen = (char) i ;
            System.out.print(zeichen);
            if(i%10 == 0){
                System.out.println("\n");
            }
        }
    }
}
