package ro.cts.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPar;
    private int numarZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPar, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPar = numarPar;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("numarSalon=").append(numarSalon);
        sb.append(", numarPar=").append(numarPar);
        sb.append(", numarZileSpitalizare=").append(numarZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
