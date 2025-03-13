package ro.cts.main;

import ro.cts.reglementare.Autoritate;
import ro.cts.reglementare.Reglementare;

public class MainNou {
    public static void main(String[] args) {
        Autoritate a1 = Autoritate.getInstance("Autoritate1");
        Reglementare reg1= a1.reglementeazaModel("Dacia Logan");
        Reglementare reg2= a1.reglementeazaModel("Tesla CyberTruck");
        System.out.println(reg1);
        System.out.println(reg2);
        Reglementare reg3= a1.reglementeazaModel("Dacia Logan");
        System.out.println(reg3);

    }
}
