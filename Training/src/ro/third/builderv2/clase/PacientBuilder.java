package ro.third.builderv2.clase;

public class PacientBuilder implements AbstractBuilder {

    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuci;
    private boolean hasHalat;


    public PacientBuilder() {
        this.hasPatRabatabil = false;
        this.hasMicDejunInclus = false;
        this.hasPapuci = false;
        this.hasHalat = false;
    }


    public PacientBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;

    }

    public PacientBuilder setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
        return this;

    }

    public PacientBuilder setHasPapuci(boolean hasPapuci) {
        this.hasPapuci = hasPapuci;
        return this;

    }

    public PacientBuilder setHasHalat(boolean hasHalat) {
        this.hasHalat = hasHalat;
        return this;

    }

    @Override
    public Pacient build(String numeClient) {
        return new Pacient(numePacient,hasHalat,hasPapuci,hasPatRabatabil,hasMicDejunInclus);
    }
}
