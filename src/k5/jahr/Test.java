package k5.jahr;

public class Test {
    public static void main(String[] args) {
        Jahr k = new Jahr();

        k.tausend = 2;
        k.hundert = 0;
        k.zehner = 2;
        k.einer = 5;
        k.jahr = "Aktuell haben wir das Jahr: ";


        System.out.println(k.jahr + k.tausend + k.hundert + k.zehner + k.einer );


    }
}
