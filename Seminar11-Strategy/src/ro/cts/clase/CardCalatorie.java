package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata {
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void afisarePlata(float pretBilet) {
        if(nrCalatorii > 0)
        {
            this.nrCalatorii=this.nrCalatorii-1;
            System.out.println("Calatoria a fost platita din cardul de calatorii, calatorii ramase: "+nrCalatorii);

        }
        else
            System.out.println("Nu ai calatorii ramase");
    }
}
