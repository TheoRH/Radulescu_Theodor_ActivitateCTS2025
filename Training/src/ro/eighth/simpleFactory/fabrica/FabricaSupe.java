package ro.eighth.simpleFactory.fabrica;

import ro.eighth.simpleFactory.clase.SupaCocos;
import ro.eighth.simpleFactory.clase.SupaLegume;
import ro.eighth.simpleFactory.clase.SupaVita;
import ro.eighth.simpleFactory.clase.Supe;

public class FabricaSupe {

    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supe getSupa(TipSupa tip, float cantitate)
    {
        switch (tip) {
            case COCOS:
                return new SupaCocos(pret,cantitate,calorii);
            case VITA:
                return new SupaVita(pret,cantitate,calorii);
            case LEGUME:
                return new SupaLegume(pret,cantitate,calorii);
            default:
                return null;
        }
    }
}
