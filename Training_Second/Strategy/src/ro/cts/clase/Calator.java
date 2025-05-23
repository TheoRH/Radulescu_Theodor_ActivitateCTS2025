package ro.cts.clase;

public class Calator {
    private String nume;
    private IMetodaPlata plata;

    public Calator(String nume, IMetodaPlata plata) {
        this.nume = nume;
        this.plata = plata;
    }

    public void setPlata(IMetodaPlata plata) {
        this.plata = plata;
    }

    public void platesteBilet(float pretBilet) {
        plata.afisarePlata(pretBilet);
    }
}
