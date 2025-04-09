package a3.abstractFactory.clase;

public class TipPersonalSpital {
    private float salariul;

    public TipPersonalSpital(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipPersonal{");
        sb.append("salariul=").append(salariul);
        sb.append('}');
        return sb.toString();
    }
}
