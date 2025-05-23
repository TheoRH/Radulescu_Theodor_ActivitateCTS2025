package ro.cts.clase;

public class SMS implements IMetodaPlata{
    public SMS() {
    }

    @Override
    public void afisarePlata(float pretBilet) {
        System.out.println("Plata efectuata");
    }
}
