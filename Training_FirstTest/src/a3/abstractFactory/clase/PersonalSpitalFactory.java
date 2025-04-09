package a3.abstractFactory.clase;



public class PersonalSpitalFactory {
    private String denumireSpital;

    public PersonalSpitalFactory(String nume, float salariu) {
        this.denumireSpital = nume;

    }

    public TipPersonalSpital getPersonalSpital(TipPersonal tip, String nume, float salariu) {
        switch (tip) {
            case TipPersonalMedical.Medic:
                return new Medic(nume, salariu);
            case TipPersonalMedical.Asistent:
                return new Asistent(nume, salariu);
            case TipPersonalMedical.Brancardier:
                return new Brancardier(salariu, nume);
            default:
                return null;
        }
    }
}
