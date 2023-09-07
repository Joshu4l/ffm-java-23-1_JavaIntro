public class HelloWorld {

    public static void main (String [] args) {

        System.out.println("Java ist cool!");

        // OPERATOREN
        // Führe Rechenoperationen und die Verwendung von Variablen in Java aus.
        // Schritt 1: Lege zwei Variablen 'a' und 'b' vom Typ int an und weise ihnen beliebige Ganzzahlen zu.
        int a = 3;
        int b = 5;
        //Schritt 2: Addiere die Werte von 'a' und 'b' und speichere das Ergebnis in einer neuen Variable 'sum'.
        int sum = a + b;
        //Schritt 3: Gib den Wert von 'sum' auf der Konsole aus, zusammen mit dem Text 'Summe: '.
        System.out.println("Summe: " + sum);


        // RELATIONALE OPERATOREN
        // Schritt 1: Führe Rechenoperationen mit 'int' Werten aus (Addition, Subtraktion, Multiplikation, Division).
        int x = 20;
        int y = 18;
        int z = 16;
        int subtractionResult = x - y;
        int additionResult = y + z;
        // Schritt 2: Vergleiche die Werte von 'int'-Variablen auf: größer, kleiner, Gleichheit.
        boolean equalityComparison = subtractionResult == additionResult;
        boolean greaterThanComparison = subtractionResult >= additionResult;
        boolean lessThanComparison = subtractionResult <= additionResult;
        System.out.println("Ergebnis des 'gleich'-Vergleichs: " + equalityComparison);
        System.out.println("Ergebnis des 'größer'-Vergleichs: " + greaterThanComparison);
        System.out.println("Ergebnis des 'gleich'-Vergleichs: " + lessThanComparison);
        // Schritt 3: Wiederhole die Schritte 1 und 2, aber nutze dieses Mal 'float' und 'double' Werte.
        double i = 20.345;
        float j = 18.251f;
        float k = 16.519f;
        double subtractionResult2 = i - j;
        double additionResult2 = j + k;
        boolean equalityComparison2 = subtractionResult2 == additionResult2;
        boolean greaterThanComparison2 = subtractionResult2 >= additionResult2;
        boolean lessThanComparison2 = subtractionResult2 <= additionResult2;
        System.out.println("Ergebnis des 2. 'gleich'-Vergleichs: " + equalityComparison2);
        System.out.println("Ergebnis des 2. 'größer'-Vergleichs: " + greaterThanComparison2);
        System.out.println("Ergebnis des 2. 'gleich'-Vergleichs: " + lessThanComparison2);

        // Freestyle
        double circleArea;
        double pi = 3.14159265359;
        int radius = 4;
        int radiusToTheSecond = radius * radius;
        circleArea = pi * radiusToTheSecond;
        System.out.println("Die Fläche des Kreises sind: " + circleArea + " FE");

        // Schritt 2: Addiere die Werte von 'a' und 'b' und speichere das Ergebnis in einer neuen Variable 'sum'.

        // Schritt 3: Gib den Wert von 'sum' auf der Konsole aus, zusammen mit dem Text 'Summe: '.


    }

}
