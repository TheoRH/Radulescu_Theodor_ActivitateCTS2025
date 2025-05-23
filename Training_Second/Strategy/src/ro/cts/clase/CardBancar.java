package ro.cts.clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }


    @Override
    public void afisarePlata(float pretBilet) {
        if(sold>=pretBilet)
        {
            sold-=pretBilet;
            System.out.println("Plata efectuata");
        }
        else System.out.println("Plata non valida");
    }
}
