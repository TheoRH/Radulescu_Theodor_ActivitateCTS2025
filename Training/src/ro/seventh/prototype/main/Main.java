package ro.seventh.prototype.main;

import ro.seventh.prototype.clase.AbstractRezervare;
import ro.seventh.prototype.clase.RezervareExterior;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareExterior = new RezervareExterior(12,15,"Cristi",12,true);
        AbstractRezervare rezervareExterior2 = rezervareExterior.clone(2);
        AbstractRezervare rezervareExterior3 = rezervareExterior.clone(3);
        System.out.println(rezervareExterior);
        System.out.println(rezervareExterior2);
        System.out.println(rezervareExterior3);
        rezervareExterior.ziualUnii(22);
        System.out.println(rezervareExterior);
        System.out.println(rezervareExterior2);

    }
}
