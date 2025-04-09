package ro.eleventh.factoryMethod.clase;

import static ro.eleventh.factoryMethod.clase.Supe.supaDeCiuperci;
import static ro.eleventh.factoryMethod.clase.Supe.supaDeLegume;

public class FactorySupa implements AbstractFactory {

    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare) {
            case supaDeLegume:
                return new SupaDeLegume(pret, calorii,cantitate);
            case supaDeCiuperci:
                return new SupaDeCiuperci(pret,calorii,cantitate);

            default:
                return null;
        }
    }
}
