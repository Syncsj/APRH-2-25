package k5.bruch;

public class Bruchtest {
    public static void main(String[] args) {

        Bruch b1 = new Bruch();

        b1.zaehler = 1;
        b1.nenner = 2;

        b1.ausgabe();

        Bruch b2 = new Bruch();

        b2.zaehler = 12;
        b2.nenner = 5;

        b2.ausgabe();

        Bruch er = new Bruch();

        b2.erweitern(2);
        b2.ausgabe();

        b1.setzen(5,8);
        b1.ausgabe();

        b1.setzen(4);
        b1.ausgabe();





    }
}
