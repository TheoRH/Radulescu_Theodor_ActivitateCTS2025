package a3.abstractFactory.program;

import a3.abstractFactory.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpitalFactory spital1 = new PersonalSpitalFactory("SF Ion",9000);
        PersonalNonMedicalFactory spital2 = new PersonalNonMedicalFactory("SF Bumbix");

        TipPersonalSpital tp1 = spital1.getPersonalSpital(TipPersonalMedical.Medic,"Popica",123456);
        TipPersonalSpital tp2=spital2.getPersonalSpital(TipPersonalNonMedical.Registrator,"Ionica",800);
        System.out.println(tp1.toString());
        System.out.println(tp2.toString());
    }
}
