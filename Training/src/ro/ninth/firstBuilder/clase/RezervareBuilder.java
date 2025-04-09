package ro.ninth.firstBuilder.clase;

import ro.ninth.firstBuilder.clase.AbstrcatBuilder;

public class RezervareBuilder implements AbstrcatBuilder {


    private Rezervare instance;

    public RezervareBuilder(String numeClient) {
        instance= new Rezervare(numeClient,false,false,false,"Fara Muzica");
    }

    @Override
    public Rezervare build() {
        return instance;
    }

    public RezervareBuilder setHasScaunErg(boolean hasScaunErg) {
        instance.setHasScaunErg(hasScaunErg);
        return this;
    }
    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        instance.setHasMasaDecorata(hasMasaDecorata);
        return this;
    }

    public RezervareBuilder setGenMuzica(String gen) {
        instance.setGenMuzica(gen);
        return this;
    }
}
