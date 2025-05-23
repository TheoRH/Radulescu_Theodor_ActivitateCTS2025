package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata = new CardCalatorie(10);
        Calator c1 = new Calator("Pop",metodaPlata);
        c1.platesteBilet(10);
        c1.setPlata(new SMS());
        c1.platesteBilet(10);
        c1.setPlata(new CardBancar(3));
        c1.platesteBilet(5);
        c1.setPlata(metodaPlata);
        c1.platesteBilet(5);
    }
}
