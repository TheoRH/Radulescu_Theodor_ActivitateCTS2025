package ro.cts.program;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura dep1 = new Departament("pediatrie",10);
        Structura dep2 = new Departament("icu",23);
        Structura dep3 = new Departament("orl",32);
        Sectie s1 = new Sectie("s1");
        Sectie s2 = new Sectie("s2");
        Sectie s3 = new Sectie("s3");

        try{
            dep3.adaugaStructura(dep1);
            dep3.adaugaStructura(dep2);

            dep2.adaugaStructura(s2);
            dep1.adaugaStructura(s1);
            dep3.adaugaStructura(s3);

            dep3.afiseazaDescriere();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
