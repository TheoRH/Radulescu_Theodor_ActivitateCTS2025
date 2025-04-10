package a4.prototype.clase;

public class Reteta extends AbstractProyotype {

    private float cantitate;

    public Reteta() {
        super();
        this.cantitate = 0;
    }

    public Reteta(String denumire, String incrediente, float cantitate) {
        super(denumire, incrediente);
        this.cantitate = cantitate;
    }

    @Override
    public AbstractProyotype clone(float cn) {
        Reteta ret = new Reteta();
        ret.cantitate=cn;
        ret.denumire=denumire;
        ret.incrediente=incrediente;
        return ret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("cantitate=").append(cantitate);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", incrediente='").append(incrediente).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
