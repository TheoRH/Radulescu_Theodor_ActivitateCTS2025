package a1.builderv2.clase;

public class Pacient {
    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatPentruInterior;

    public Pacient(String numePacient, boolean hasPatRabatabil, boolean hasMicDejun, boolean hasPapuciDeCamera, boolean hasHalatPentruInterior) {
        this.numePacient = numePacient;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatPentruInterior = hasHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejun=").append(hasMicDejun);
        sb.append(", hasPapuciDeCamera=").append(hasPapuciDeCamera);
        sb.append(", hasHalatPentruInterior=").append(hasHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
