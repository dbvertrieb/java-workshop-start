# Das Hangman-Spiel

# Zeichenfolgen

Java sieht drei Klassen vor, die Zeichenfolgen verwalten. Sie unterscheiden sich in drei Punkten:
*	Sind die Zeichenfolgen unveränderbar (immutable), können sie also später nicht mehr verändert werden?
*	Sind die Zeichenfolgen später veränderbar (mutable)?
*	Sind die Operationen auf den Zeichenketten gegen nebenläufige Zugriffe aus mehreren Threads abgesichert?

	
Sicher? |  immutable |  mutable
--- | --- | ---
Threadsicher |	String| StringBuffer
nicht threadsicher |	|	StringBuilder

**immutable:** Objekte, deren Zustand sich nicht verändern lässt 

## String

Die Entwickler von Java haben eine Symbiose zwischen String als Klasse und dem String als eingebautem Datentyp vorgenommen. Die Sonderbehandlung gegenüber anderen Objekten ist an zwei Punkten abzulesen:
*	Die Sprache ermöglicht die direkte Konstruktion von String-Objekten aus String-Literalen (Zeichenketten in doppelten Anführungszeichen).
*	Die Konkatenation (Aneinanderreihung von Strings mit +) von mehreren Strings ist erlaubt, aber Plus ist für keinen anderen Objekttyp erlaubt. Es lassen sich zum Beispiel nicht zwei Point-Objekte addieren. Mit dem Plus auf String-Objekten ist also ein besonderer Operator auf der Klasse String definiert, der nicht eigenständig auf anderen Klassen definiert werden kann. Java unterstützt keine überladenen Operatoren für Klassen, und dieses Plus ist ein Abweichler.

### String-Literale
**Beispiel:** "DB Vertrieb"

```java
"Hi Chris".length();
```

**Was ist richtig?**
```java
String s = new String("Wort");
String s = "Wort";
```

### Konkatination mit +

```java
int    age    = 39; 
double height = 1.83; 
String s = "Alter: " + age + ", Größe: " + height; 
System.out.println( s );      // Alter: 39, Größe: 1.83


```
### String-Länge und Test auf Leer-String
### Zugriff auf ein bestimmtes Zeichen mit charAt( )
### Nach enthaltenen Zeichen und Zeichenfolgen suchen
#### Fundstelle mit indexOf(…) zurückgeben
#### Vom Ende an suchen
#### Anzahl der Teil-Strings einer Zeichenkette 

### Gut, dass wir verglichen haben 
### String-Teile extrahieren 
### Strings anhängen, zusammenfügen, Groß-/Kleinschreibung und Leerraum 
### Gesucht, gefunden, ersetzt
### String-Objekte mit Konstruktoren neu anlegen 




## Veränderbare Zeichenketten
(Kapitel 4.5)
