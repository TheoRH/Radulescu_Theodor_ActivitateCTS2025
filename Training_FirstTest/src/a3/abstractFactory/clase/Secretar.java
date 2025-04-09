package a3.abstractFactory.clase;

public class Secretar extends TipPersonalSpital{

    private String nume;

    public Secretar(float salariul, String nume) {
        super(salariul);
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Secretar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
