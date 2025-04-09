package ro.ninth.firstBuilder.program;

import ro.ninth.firstBuilder.clase.Rezervare;
import ro.ninth.firstBuilder.clase.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Tudor");
        Rezervare rezervare = builder.setHasMasaDecorata(true).setGenMuzica("Dnce").build();
        Rezervare rezervare1 = builder.setGenMuzica("Rock").build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}
