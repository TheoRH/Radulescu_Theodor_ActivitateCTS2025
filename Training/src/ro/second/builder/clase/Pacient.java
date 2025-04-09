package ro.second.builder.clase;

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

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    public void setHasPapuci(boolean hasPapuci) {
        this.hasPapuci = hasPapuci;
    }

    public void setHasHalat(boolean hasHalat) {
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
