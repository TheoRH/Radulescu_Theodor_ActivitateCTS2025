package ro.cts.clase;

public class AdapterMedicamente extends MedicamentFarmacie{
    private MedicamentSpital medicamentSital;

    public AdapterMedicamente(MedicamentSpital medicamentSital) {
        super(medicamentSital.getNumeMedicament(), "01/01/2025", true, medicamentSital.getPret());
        this.medicamentSital = medicamentSital;
    }
    @Override
    public void cumparaMedicament(){
        super.cumparaMedicament();
    }
}
