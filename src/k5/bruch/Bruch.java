package k5.bruch;

import org.w3c.dom.ls.LSOutput;

public class Bruch {
    int zaehler;
    int nenner;
    int erweitern;

    public void ausgabe(){
        System.out.println(zaehler + "/" + nenner);
    }



    public void erweitern(int faktor) {
        zaehler = zaehler * faktor;
        nenner = nenner * faktor;

    }
    public void setzen(int zaehler, int n) {
        this.zaehler = zaehler;
        nenner = n;

    }
    public void setzen(int wert){
        zaehler = wert;
        nenner = wert;


    }
}
