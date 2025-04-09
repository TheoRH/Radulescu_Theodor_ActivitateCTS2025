package ro.eleventh.factoryMethod.clase;

public class SupaDeCiuperci extends FelDeMancare {
    private int cantitate;

    public SupaDeCiuperci(float pret, float nrCalorii, int cantitate) {
        super(pret, nrCalorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaDeCiuperci{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
