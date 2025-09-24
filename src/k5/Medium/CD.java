package k5.Medium;

public class CD {
    // private Felder
    private String interpreter;
    private int titel;

    // Konstruktor
    public CD(String interpreter, int titel) {
        this.interpreter = interpreter;
        this.titel = titel;
    }

    // Getter für Titelanzahl
    public int getAnzahl() {
        return titel;
    }

    // Abspiel-Methode
    public void abspiel() {
        System.out.println("Interpreter: " + interpreter + ", Anzahl der Titel: " + titel);
    }

    // Optional: Getter/Setter
    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public void setTitel(int titel) {
        this.titel = titel;
    }
}