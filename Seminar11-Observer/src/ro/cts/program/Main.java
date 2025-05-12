package ro.cts.program;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("calator1");
        Observer calator2 = new Calator("calator2");
        Observer calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(168);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.plecaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseu();

    }
}
