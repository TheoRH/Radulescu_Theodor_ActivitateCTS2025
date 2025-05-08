package ro.cts.program;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();
        PacientAbstract pacient = fabrica.getPacient("Popica", "07333","nimick@yahoo.com");


        Spitalizare spitalizare1 = new Spitalizare(101,1,33);
        Spitalizare spitalizare2 = new Spitalizare(102,2,22);
        Spitalizare spitalizare3 = new Spitalizare(103,3,77);
        Spitalizare spitalizare4 = new Spitalizare(104,4,2);


        pacient.afiseazaPacient(spitalizare1);
        pacient.afiseazaPacient(spitalizare2);

        fabrica.getPacient("Ioana","0888","ase@ase.ro").afiseazaPacient(spitalizare3);
        try {
            fabrica.getPacient("0888").afiseazaPacient(spitalizare4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
