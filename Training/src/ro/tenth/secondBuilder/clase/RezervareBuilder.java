package ro.tenth.secondBuilder.clase;

public class RezervareBuilder implements AbstractBuilder {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScaunErg;
    private boolean hasMasaDecorata;
    private String genMuzica;

    public RezervareBuilder() {
        this.hasAsezareGeam = false;
        this.hasScaunErg = false;
        this.hasMasaDecorata = false;
        this.genMuzica = "Fara muzica";
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }
    public RezervareBuilder setHasAsezareGeam(boolean asezareGeam) {
        this.hasAsezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setHasScaunErg(boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient,hasAsezareGeam,hasScaunErg,hasMasaDecorata,genMuzica);
    }
}
