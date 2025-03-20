package ro.cts.main;

import ro.cts.clase.SupaLegume;
import ro.cts.clase.Supe;
import ro.cts.fabricuta.FabricaSupe;
import ro.cts.fabricuta.TipSupa;

public class Program {
    public static void main(String[] args) {
        FabricaSupe fabricuta = new FabricaSupe(100,20);
        Supe supica=fabricuta.getSupa(TipSupa.LEGUME,300);
        supica.afiseazaDescriere();
        Supe supica2 = fabricuta.getSupa(TipSupa.VITA,300);
        supica2.afiseazaDescriere();
        Supe supica3 = fabricuta.getSupa(TipSupa.COCS,210);
        supica3.afiseazaDescriere();

    }
}
