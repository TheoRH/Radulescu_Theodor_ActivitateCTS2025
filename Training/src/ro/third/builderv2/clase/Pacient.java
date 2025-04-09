package ro.third.builderv2.clase;

public class Pacient {

    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuci;
    private boolean hasHalat;

    public Pacient(String numePacient, boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuci, boolean hasHalat) {
        this.numePacient = numePacient;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuci = hasPapuci;
        this.hasHalat = hasHalat;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejunInclus=").append(hasMicDejunInclus);
        sb.append(", hasPapuci=").append(hasPapuci);
        sb.append(", hasHalat=").append(hasHalat);
        sb.append('}');
        return sb.toString();
    }
}
