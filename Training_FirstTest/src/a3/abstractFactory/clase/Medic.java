package a3.abstractFactory.clase;



public class Medic extends TipPersonalSpital {
    private String nume;

    public Medic(String nume, float salariul) {
        super(salariul);
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
