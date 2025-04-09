package a2.simpleFactory.fabricuta;

import a2.simpleFactory.clase.Asistent;
import a2.simpleFactory.clase.Brancardier;
import a2.simpleFactory.clase.Medic;
import a2.simpleFactory.clase.PersonalSpital;

public class PersonalSpitalFactory {
    private String nume;
    private float salariu;

    public PersonalSpitalFactory(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public PersonalSpital getPersonalSpital(TipPersonalSpital tip) {
        switch (tip) {
            case Medic:
                return new Medic(nume, salariu);
            case Asistent:
                return new Asistent(nume, salariu);
            case Brancardier:
                return new Brancardier(nume, salariu);
            default:
                return null;
        }
    }
}
