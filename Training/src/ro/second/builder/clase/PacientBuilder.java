package ro.second.builder.clase;

public class PacientBuilder implements AbstractBuilder {

    private Pacient instance;


    public PacientBuilder(String numeClient) {
        instance = new Pacient(numeClient,false,false,false,false);
    }

    @Override
    public Pacient build() {
        return instance;
    }

    public PacientBuilder setHasHalat(boolean hasHalat) {
        instance.setHasHalat(hasHalat);
        return this;
    }

    public PacientBuilder setHasPapuci(boolean hasPapuci) {
        instance.setHasPapuci(hasPapuci);
        return this;
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        instance.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }
}
