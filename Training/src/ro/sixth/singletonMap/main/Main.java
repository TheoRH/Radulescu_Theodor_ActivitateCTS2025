package ro.sixth.singletonMap.main;

import ro.sixth.singletonMap.clase.Autoritate;
import ro.sixth.singletonMap.clase.Reglementare;

public class Main {
    public static void main(String[] args) {
        Autoritate a1 = Autoritate.getInstance("Autoritate1");
        Reglementare reg1 = a1.reglementeazaModel("Dacia Logan");
        Reglementare reg2=a1.reglementeazaModel("Tesla Model3");
        System.out.println(reg1);
        System.out.println(reg2);
        Reglementare reg3=a1.reglementeazaModel("Dacia Logan");
        System.out.println(reg3);

        System.out.println(a1);
    }
}
