package ro.cts.clase;

public abstract class Supe {
    private float pret;
    private float cantitate;
    private float calorii;

    public Supe(float pret, float cantitate, float calorii) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supe{");
        sb.append("pret=").append(pret);
        sb.append(", cantitate=").append(cantitate);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }

    public float getCantitate() {
        return cantitate;
    }

    public float getCalorii() {
        return calorii;
    }

    public float getPret() {
        return pret;
    }

    public float calculeazaPret100g()
    {
        return pret/cantitate*100;
    }

    public abstract void afiseazaDescriere();
}
