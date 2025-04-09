package ro.fifth.singletonLazy.clase;

public class AutoritateReglementareaMasiniLazy {

    private String denumire;
    private float nrMasini;
    private static AutoritateReglementareaMasiniLazy instance=null;

    public AutoritateReglementareaMasiniLazy(float nrMasini, String denumire) {
        this.nrMasini = nrMasini;
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getNrMasini() {
        return nrMasini;
    }

    public void setNrMasini(float nrMasini) {
        this.nrMasini = nrMasini;
    }

    public synchronized static AutoritateReglementareaMasiniLazy getInstance(String denumire,float nrMasini) {
        if (instance == null) {
          instance = new AutoritateReglementareaMasiniLazy(nrMasini, denumire);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareaMasiniLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrMasini=").append(nrMasini);
        sb.append('}');
        return sb.toString();
    }
}
