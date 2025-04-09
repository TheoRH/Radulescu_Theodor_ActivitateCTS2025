package a2.simpleFactory.clase;

public abstract class PersonalSpital {
    private String nume;
    private float salariul;

    public PersonalSpital(String nume, float salariul) {
        this.nume = nume;
        this.salariul = salariul;
    }


    public String getNume() {
        return nume;
    }

    public float getSalariul() {
        return salariul;
    }

    public abstract void descriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariul=").append(salariul);
        sb.append('}');
        return sb.toString();
    }
}
