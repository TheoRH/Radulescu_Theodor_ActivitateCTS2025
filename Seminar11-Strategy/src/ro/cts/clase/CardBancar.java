package ro.cts.clase;

public class CardBancar implements IMetodaPlata {
    private float sold;


    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void afisarePlata(float pretBilet) {
        if (sold >= pretBilet)
        {
            this.sold -= pretBilet;
            System.out.println("A fost platita calatoria cu cardul bancar, sold actual: "+this.sold);
        }
        else
            System.out.println("Sold insuficient");

    }
}
