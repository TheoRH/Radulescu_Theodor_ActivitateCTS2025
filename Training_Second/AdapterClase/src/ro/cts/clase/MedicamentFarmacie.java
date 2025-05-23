package ro.cts.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie {
    private String numeMedicament;
    private String dataExpriare;
    private boolean esteInStoc;
    private float pret;

    public MedicamentFarmacie(String numeMedicament, String dataExpriare, boolean esteInStoc, float pret) {
        this.numeMedicament = numeMedicament;
        this.dataExpriare = dataExpriare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul "+numeMedicament+" a fost cumparat la pretul de "+pret+" si expira la data de "+dataExpriare);
    }
}
