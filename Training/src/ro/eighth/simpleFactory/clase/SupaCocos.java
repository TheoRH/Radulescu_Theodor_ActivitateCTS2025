package ro.eighth.simpleFactory.clase;

public class SupaCocos extends Supe{


    public SupaCocos(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
