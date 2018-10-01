# Operatoren

## Zuweisungoperator
* wird genutzt zum setzen von Werten

```java
int a = 1;
System.out.println( a = 3 );
```
**Frage:** Was wird hier ausgegeben?

Mehrfache Zuweisungen sind möglich:

```java
a = (b = c + d) + e;
```

Besser:
```java
b = c + d;
a = b + e;
```

## Arithmetische Operatoren
```java
System.out.println( 2 + 2 );

System.out.println( 4 - 2 );
System.out.println( 4 - 5 );

System.out.println( 2 * 2 );

System.out.println( 9 / 3 );

System.out.println( 9 % 3 );
System.out.println( 9 % 4 );

int a = 10;
a = -a;
System.out.println( a );
```

**Aufgabe 1:**
Programmiere folgenden Anweisungen nacheinander nach und führe den Code aus:
```java
System.out.println( 0 / 2 );
System.out.println( 2 / 0 );
System.out.println( 7 / 2 );
```

## Zuweisung mit Operation
* arithmetische Operatoren können mit dem Zuweisungoperator kombiniert werden

```java
a += 2;     // a = a + 2;
a -= 2;     // a = a - 2;
a *= 2;     // a = a * 2;
a /= 2;     // a = a / 2;
```

**Aufgabe 2:**
Programmiere den Code nach, initialisiere vorab die Variable 'a' mit einem Wert:
und gebe jedes Ergebnis aus.

## Präfix- oder Postfix-Inkrement und -Dekrement
```java
a++;        // a = a + 1;
b--;        // b = b - 1;

++c;        // c = c + 1;
--d;        // d = d - 1;
```

__Der Präfix-Operator verändert die Variable vor der Auswertung des Ausdrucks, und der Postfix-Operator ändert sie nach
der Auswertung des Ausdrucks.__

**Aufgabe 3:**
Programmiere den Code nach um den Effekt zu sehen.Gebe jedes Ergebnis aus.


## Vergleichsoperatoren
* vergleichen Werte miteinander
* Ergebnis ist ein Wahrheitswert vom Typ 'boolean'
* folgende Operaten gibt es:
    * \>
    * <
    * \>=
    * <=
    * ==
    * !=

**Aufgabe 4:**
Programmiere den Code nach und gebe jedes Ergebnis aus.

```java
System.out.println(6 > 9);
System.out.println(9 > 6);
System.out.println(6 > 6);

System.out.println(5 < 20);
System.out.println(21 < 20);

System.out.println(9 >= 6);
System.out.println(6 >= 6);

System.out.println(6 == 6);
System.out.println(7 == 6);

System.out.println(6 != 6);
System.out.println(6 != 8);
```

Zusatzaufgabe:

## Logische Operatoren
* werden für Bedingungen verwendet (nächstes Kapitel)
* verknüpfen Wahrheitswerte miteinander
* Ergebnis ist wieder ein Wahrheitswert

    * ! (nicht): Dreht die Aussage um, aus wahr wird falsch, und aus falsch wird wahr
    * && (und): Beide Aussagen müssen zutreffen
    * || (oder): Nur eine der beiden Aussagen muss zutreffen
    * ^ (xor): Nur eine der beiden Aussagen darf zutreffen (Sprachgebrauch)

```java
int a = 1;
System.out.println(a == 1);
System.out.println(!(a == 1));

int b = 1;
System.out.println(b < 3 && b == 1);
System.out.println(b < 3 && b > 1);

int c = 1;
System.out.println(c < 3 || c == 1);
System.out.println(c < 3 || c > 1);
System.out.println(c == 3 || c > 1);

int d = 1;
System.out.println(d < 3 ^ d == 1);
System.out.println(d < 3 ^ d > 1);
```

**Aufgabe 5:**
Programmiere den Code nach und gebe jedes Ergebnis aus.

## Zusatzaufgabe:
Was gibt die folgende Zeile aus:
```java
System.out.println("Result: " + 2+2);
```

## Quellen
* http://openbook.rheinwerk-verlag.de/javainsel/02_004.html#u2.4