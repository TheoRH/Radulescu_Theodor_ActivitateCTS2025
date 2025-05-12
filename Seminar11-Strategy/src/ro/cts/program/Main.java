package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlata1 = new CardCalatorie(5);

        Calator student = new Calator("Popica",metodaPlata1);
        student.platesteBilet(10);
        student.setMetodaPlata(new SMS());
        student.platesteBilet(10);
        student.setMetodaPlata(new CardBancar(10));
        student.platesteBilet(5);
        student.setMetodaPlata(metodaPlata1);
        student.platesteBilet(10);

    }
}
