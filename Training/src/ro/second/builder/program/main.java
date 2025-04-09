package ro.second.builder.program;

import ro.second.builder.clase.Pacient;
import ro.second.builder.clase.PacientBuilder;

public class main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Tudor");
        Pacient pacient = pacientBuilder.setHasHalat(true).build();
        Pacient pacient2 = pacientBuilder.setHasPatRabatabil(true).build();
        System.out.println(pacient);
        System.out.println(pacient2);

    }
}
