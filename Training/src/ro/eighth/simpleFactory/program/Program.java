package ro.eighth.simpleFactory.program;

import ro.eighth.simpleFactory.clase.Supe;
import ro.eighth.simpleFactory.fabrica.FabricaSupe;
import ro.eighth.simpleFactory.fabrica.TipSupa;

public class Program {
    public static void main(String[] args) {
        FabricaSupe fabricuta = new FabricaSupe(100,30);
        Supe supica= fabricuta.getSupa(TipSupa.LEGUME,300);
        supica.afiseazaDescriere();
        Supe supica2= fabricuta.getSupa(TipSupa.VITA,100);
        supica2.afiseazaDescriere();
        Supe supica3 = fabricuta.getSupa(TipSupa.COCOS,300);
        supica3.afiseazaDescriere();
    }
}
