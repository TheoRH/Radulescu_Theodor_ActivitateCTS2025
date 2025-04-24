package ro.cts.program;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumeClient;
import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareProxy;

public class Program {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);

        proxy.realizareRezervare(2,"Popica");
        proxy.realizareRezervare(10,"Ioana");

        System.out.println();

        IRezervare proxyCompus = new ProxyNumeClient(proxy); //aici demonstram ce inseamna prosyCompus
        proxyCompus.realizareRezervare(2,"Popica");
        proxyCompus.realizareRezervare(10,"Ion");
        proxyCompus.realizareRezervare(5,"Popica Marius");
    }
}
