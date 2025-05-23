package ro.cts.program;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabirca = new FabricaPacienti();
        PacientAbstract pacient = fabirca.getPacient("Popica","073333","nimick@yahoo.com");

        Spitalizare s1 = new Spitalizare(101,1,33);
        Spitalizare s2 = new Spitalizare(102,2,200);
        Spitalizare s3 = new Spitalizare(103,3,11);
        Spitalizare s4 = new Spitalizare(104,4,123);

        pacient.afiseazaPacient(s1);
        pacient.afiseazaPacient(s2);
        fabirca.getPacient("Ioana","0888","ase@ase.ro").afiseazaPacient(s3);
        try{
            fabirca.getPacient("0888").afiseazaPacient(s4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
