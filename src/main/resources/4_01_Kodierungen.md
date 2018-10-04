#Kodierungen

## ASCII
* 7-Bit Codierung
* 128 Zeichen
* 94 druckbare Zeichen (Buchstaben, Ziffern, Interpunktionszeichen)
* 33 nicht druckbare Kontrollzeichen (etwa den Tabulator und viele andere Zeichen)
* 0-31 Kontrollzeichen
* 32 Leerzeichen
* 33-126 druckbare Zeichen
* 127 Kontrollzeichen "delete"

**Aufgabe:** Gib alle Zeichen der ASCII-Tabelle aus

## ISO/IEC 8859-1 

* 8-Bit Codierung -> 256 Zeichen
* Lateinisches Alphabet + diakritischen Zeichen (ü, á, à, ó, â, Å, Æ ...) 
* Stellen 0-31 + 127 (Kontrolzeichen) + 128 bis 159 bleiben leer
* auch **Latin-1** genannt

## Unicode
**Latin-1** enthält nicht:
* griechische Alphabet
* kyrillische Buchstaben
* chinesische Zeichen 
* japanische Zeichen
* mathematische Zeichen 
 
 
  und vieles mehr
 
 Ziel von Unicode ist die Kodierung aller Zeichen dieser Welt
 
 Unicode enthält alle Zeichen aus ISO 8859-1, was die Konvertierung von Dokumenten vereinfacht. 
 
 So behält zum Beispiel "A" den Codepoint 65 von ISO 8859-1, den der Buchstabe wiederum von ASCII erbt. 
 
 Unicode ist aber viel mächtiger als ASCII oder Latin-1: Die letzte Version des Unicode-Standards 6 beschreibt über 100.000 Zeichen.

 Angebe von Unicode in Dezimal ist unpraktisch, darum wird dafür die Hexadezimalschreibweise verwendet

Der Buchstabe "A" ist dann U+0041

## UTF-8

## Escape-Sequenzen / Fluchtsymbole

````java
\b      Rückschritt (Backspace)
\n      Zeilenschaltung (Newline)
\f      Seitenumbruch (Formfeed)
\r      Wagenrücklauf (Carriage return)
\t      horizontaler Tabulator
\"      doppeltes Anführungszeichen
\'      einfaches Anführungszeichen
\\      Backslash

\u      leitet einen Unicode ein                      
```` 

**Aufgabe:**  Welche Zeichen repräsentieren diese Codes?
* \u20ac 
* \u00c4
* \u00e4
* \u2639 


 