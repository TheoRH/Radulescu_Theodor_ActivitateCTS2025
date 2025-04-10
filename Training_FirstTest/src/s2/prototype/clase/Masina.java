package s2.prototype.clase;

public class Masina implements IMasina {
    private String denumire;
    private int anFabricatie;
    private float dimensiuni;

    public Masina(String denumire, int anFabricatie, float dimensiuni) {
        this.denumire = denumire;
        this.anFabricatie = anFabricatie;
        this.dimensiuni = dimensiuni;
    }


    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int anFabricatie() {
        return this.anFabricatie;
    }
}
