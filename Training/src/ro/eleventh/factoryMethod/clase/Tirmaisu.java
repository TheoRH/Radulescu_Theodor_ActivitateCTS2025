package ro.eleventh.factoryMethod.clase;

public class Tirmaisu extends FelDeMancare {
    private String crema;

    public Tirmaisu(float pret, float nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Tirmaisu{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
