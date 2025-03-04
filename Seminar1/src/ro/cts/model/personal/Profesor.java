package ro.cts.model.personal;

public class Profesor extends Persoana implements IPredabil {


    private String id;
    private float salariul;
    private float sporVechime;

    public Profesor(String nume, int varsta, String id, float salariul, float sporVechime) {
        super(nume, varsta);
        this.id = id;
        this.salariul = salariul;
        this.sporVechime = sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder str = new StringBuilder();
        str.append("Profesorul ");
        str.append(this.nume);
        str.append(" ");
        str.append("preda la curs");
        System.out.println(str.toString());
    }

    @Override
    public float calculareVenit() {
        return salariul+salariul*sporVechime;
    }
}
