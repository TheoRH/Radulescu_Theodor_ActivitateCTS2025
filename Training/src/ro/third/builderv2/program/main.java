package ro.third.builderv2.program;


import ro.third.builderv2.clase.Pacient;
import ro.third.builderv2.clase.PacientBuilder;

public class main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        Pacient pacient = pacientBuilder.setHasHalat(true).build("Sorin");
        Pacient pacient2 = pacientBuilder.setHasPatRabatabil(true).build("Marian");
        System.out.println(pacient);
        System.out.println(pacient2);

    }
}
