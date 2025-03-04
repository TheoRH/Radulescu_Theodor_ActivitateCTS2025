package ro.cts.model.personal;

public class Asistent extends Persoana implements IPredabil {
    private String id;
    private float salariul;

    public Asistent(String nume, int varsta, String id, float salariul) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
    }

    public String getId() {
        return id;
    }

    public float getSalariul() {
        return salariul;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public void preda() {
        StringBuilder str = new StringBuilder();
        str.append("Asistentul ");
        str.append(this.nume);
        str.append(" ");
        str.append("preda la seminar");
        System.out.println(str.toString());
    }

    @Override
    public float calculareVenit() {
        return salariul;
    }
}
