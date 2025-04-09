package a3.abstractFactory.clase;

public class Registrator extends TipPersonalSpital{

    private String nume;

    public Registrator(float salariul, String nume) {
        super(salariul);
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Registrator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
