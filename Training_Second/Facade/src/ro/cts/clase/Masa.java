package ro.cts.clase;

public class Masa {
    private int numarMasa;
    private boolean esteLibera;

    public Masa(int numarMasa, boolean esteLibera) {
        this.numarMasa = numarMasa;
        this.esteLibera = esteLibera;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", esteLibera=").append(esteLibera);
        sb.append('}');
        return sb.toString();
    }
}
