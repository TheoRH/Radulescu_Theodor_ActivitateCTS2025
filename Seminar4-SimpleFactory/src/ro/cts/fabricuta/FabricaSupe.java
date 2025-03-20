package ro.cts.fabricuta;

import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;
import ro.cts.clase.Supe;

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
            case COCS:
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
