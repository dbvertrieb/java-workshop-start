# Character-Klasse
Die im Kernpaket java.lang angesiedelte Klasse Character bietet eine große Anzahl statischer Methoden, die im Umgang mit einzelnen Zeichen interessant sind. Dazu gehören Methoden zum Testen, etwa ob ein Zeichen eine Ziffer, ein Buchstabe oder ein Sonderzeichen ist.

## char oder Character?

## isXXX()

**Handelt es sich um eine Ziffer zwischen 0 und 9?**
```java
static boolean isDigit(char ch)    
```
**Handelt es sich um einen Buchstaben?**
```java
static boolean isLetter(char ch)     
```
**Handelt es sich um ein alphanumerisches Zeichen?**
```java
static boolean isLetterOrDigit(char ch)

```
 **Ist es ein Klein- oder ein Großbuchstabe?**
```java
static boolean isLowerCase(char ch)
boolean isUperCase(char ch)
```
**Ist es ein white space (Leerzeichen, Zeilenvorschub, Return oder Tabulator)?**
```java
static boolean isWhiteSpace(char ch)
```

**Aufgabe** Probiere alle isXXX()-Methoden aus
**Aufgabe** Erstelle ein Programm, dass einen eingegebenen Text in Großbuchstaben umwandelt und WhiteSpace durch '_' ersetzt. Der umgewandelte Text soll wieder ausgegeben werden


## Ziffern einer Basis

```java
static int digit(char ch, int radix) 
```

```java
static char forDigit(int digit, int radix) 
```
**Aufgabe:** Wandle die folgenden Hex-Zahlen in Dezimalzahlen um: F, 10, A

**Aufgabe:** Wandle die folgenden Dezimalzahlen in Binär-, Oktal- und Hexadezimal-Zahlen um: 5, 6, 10