package k5.Medium;

public class Radio {
    public static void main(String[] args) {
        // CD-Objekt mit Konstruktor erstellen
        CD cd1 = new CD("Leser", 15);

        // CD abspielen
        cd1.abspiel();

        // Titelanzahl ausgeben
        System.out.println("Titelanzahl: " + cd1.getAnzahl());
    }
}