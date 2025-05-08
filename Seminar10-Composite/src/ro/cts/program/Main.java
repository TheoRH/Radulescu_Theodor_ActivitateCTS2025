package ro.cts.program;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departamanet1 = new Departament("pediatrie", 34);
        Structura departamanet2 = new Departament("icu",10);
        Structura departamanet3 = new Departament("general",50);

        Sectie sectie1 = new Sectie("sectie1");
        Sectie sectie2 = new Sectie("sectie2");
        Sectie sectie3 = new Sectie("sectie3");


        try{
            departamanet3.adaugaStructura(departamanet1);
            departamanet3.adaugaStructura(departamanet2);

            departamanet2.adaugaStructura(sectie2);
            departamanet1.adaugaStructura(sectie1);
            departamanet3.adaugaStructura(sectie3);

            departamanet3.afiseazaDescriere();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }





    }
}
