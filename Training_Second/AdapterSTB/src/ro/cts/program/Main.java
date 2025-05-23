package ro.cts.program;

import ro.cts.clase.AdapterTransport;
import ro.cts.clase.Autobuz;
import ro.cts.clase.Metrou;

public class Main {
    public static void main(String[] args) {
        Metrou metrou = new Metrou("Bombix",11);
        Autobuz autobuz = new Autobuz("Rumba");
        autobuz.getDenumire();
        AdapterTransport adapterTransport= new AdapterTransport(autobuz);
//        adapterTransport.getDenumire();
    }
}
