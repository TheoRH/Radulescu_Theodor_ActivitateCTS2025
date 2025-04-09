package a3.abstractFactory.clase;

public class Asistent extends TipPersonalSpital{
    private String nume;

    public Asistent(String nume,float salariul) {
        super(salariul);
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Asistent{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
