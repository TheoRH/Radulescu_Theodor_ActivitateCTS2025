package ro.cts.clase;

public class MedicamentSpital {
    private String numeMedicament;
    private float pret;

    public MedicamentSpital(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public void prezintaRetea(){
        System.out.println("Este prezentata reteta pentru medicamentul "+numeMedicament);

    }

    public void achizioneMedicament(){
        System.out.println("Meicamentul "+numeMedicament+" a fost achizionat la pretul de "+pret);
    }
    public String getNumeMedicament() {
        return numeMedicament;
    }

    public float getPret() {
        return pret;
    }
}
