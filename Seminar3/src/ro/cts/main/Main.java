package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args) {
        AutoritateReglementareMasiniEager autoriate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoriate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebsite("https://www.google.com");
        System.out.println(autoritate2);

        autoritate2.reglementeazaModel("Logan4");
        System.out.println(autoriate);

        AutoritateReglementareMasiniLazy autoritate3=AutoritateReglementareMasiniLazy.getInstance("AutoritateSpeciala","www.specialcom");
        System.out.println(autoritate3);
        AutoritateReglementareMasiniLazy autoritate4=AutoritateReglementareMasiniLazy.getInstance("AutoritateSpeciala2","www.special2.com");
        System.out.println(autoritate4);
        autoritate4.reglementeazaModel("Logan5");
        System.out.println(autoritate4);
        System.out.println(autoritate3);
    }
}
