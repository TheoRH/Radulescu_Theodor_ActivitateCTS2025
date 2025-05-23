package ro.cts.program;

import ro.cts.clase.Facade;
import ro.cts.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(4,true);

        Facade telefon = new Facade();
        System.out.println(telefon.verificaAsezareMasa(masa));
        Masa masa2 = new Masa(7,true);
        System.out.println(telefon.verificaAsezareMasa(masa2));
        Masa masa3 = new Masa(8,true);
        System.out.println(telefon.verificaAsezareMasa(masa3));
    }
}
