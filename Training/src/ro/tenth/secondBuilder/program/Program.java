package ro.tenth.secondBuilder.program;

import ro.tenth.secondBuilder.clase.Rezervare;
import ro.tenth.secondBuilder.clase.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        RezervareBuilder Builder = new RezervareBuilder();
        Rezervare Rezervare = Builder.setGenMuzica("Dance").setHasAsezareGeam(true).build("Popica");
        Rezervare Rezervare2=Builder.setHasScaunErg(true).build("Marius");
        System.out.println(Rezervare.toString());
        System.out.printf(Rezervare2.toString());
    }
}
