package a1.builderv2.clase;

public class SpitalBuilder implements AbstractBuilder {

    private Pacient instance;

    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatPentruInterior;

    public SpitalBuilder() {
        this.hasPatRabatabil = false;
        this.hasMicDejun = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatPentruInterior = false;
    }

    public SpitalBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public SpitalBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;

    }

    public SpitalBuilder setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;

    }

    public SpitalBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        return this;

    }

    public SpitalBuilder setHasHalatPentruInterior(boolean hasHalatPentruInterior) {
        this.hasHalatPentruInterior = hasHalatPentruInterior;
        return this;

    }


    @Override
    public Pacient build(String numePacient) {
        return new Pacient(numePacient,hasPatRabatabil,hasMicDejun,hasPapuciDeCamera,hasHalatPentruInterior);
    }
}
