package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }


    @Override
    public void afisarePlata(float pretBilet) {
        if(nrCalatorii>0)
        {
            this.nrCalatorii--;
            System.out.println("Plata efectuata");
        }
        else
        {
            System.out.println("Plata non valida");
        }
    }
}
