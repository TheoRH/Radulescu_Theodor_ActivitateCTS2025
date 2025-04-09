package a3.abstractFactory.clase;

public class PersonalNonMedicalFactory {
    private String denumire;

    public PersonalNonMedicalFactory(String denumire) {
        this.denumire = denumire;
    }

    public TipPersonalSpital getPersonalSpital(TipPersonal tip, String nume, float salariu) {
        switch (tip){
            case TipPersonalNonMedical.Secretar:
                return new Secretar(salariu, nume);
            case TipPersonalNonMedical.Registrator:
                return new Registrator(salariu, nume);
            default:
                return null;
        }
    }
}
