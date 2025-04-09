package a3.abstractFactory.clase;

public class Brancardier extends TipPersonalSpital{
    private String nume;

    public Brancardier(float salariul, String nume) {
        super(salariul);
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Brancardier{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
