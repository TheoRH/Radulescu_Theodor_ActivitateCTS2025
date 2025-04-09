package a2.simpleFactory.program;

import a2.simpleFactory.clase.Brancardier;
import a2.simpleFactory.clase.PersonalSpital;
import a2.simpleFactory.fabricuta.PersonalSpitalFactory;
import a2.simpleFactory.fabricuta.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory spital = new PersonalSpitalFactory("Clanul Popica",5000);
        PersonalSpital b1 = spital.getPersonalSpital(TipPersonalSpital.Brancardier);
        PersonalSpital a1 = spital.getPersonalSpital(TipPersonalSpital.Asistent);
        PersonalSpital m1 = spital.getPersonalSpital(TipPersonalSpital.Medic);
        a1.descriere();
        b1.descriere();
        m1.descriere();
    }
}
