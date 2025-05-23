package ro.cts.program;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer c1 = new Calator("c1");
        Observer c2 = new Calator("c2");
        Observer c3 = new Calator("c3");

        MijlocTransport transport = new Autobuz(168);
        transport.adaugaObserver(c1);
        transport.adaugaObserver(c2);
        transport.adaugaObserver(c3);
        transport.plecaDeLaCapat();
        transport.stergeObserver(c2);
        ((Autobuz)(transport)).schimbaTraseu();

    }
}
