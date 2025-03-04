package ro.cts.model.personal;

public class Student extends Persoana {
    private String idStudnt;
    private float bursa;

    public Student(String nume, int varsta, String idStudnt, float bursa) {
        super(nume, varsta);
        this.idStudnt = idStudnt;
        this.bursa = bursa;
    }

    public String getIdStudnt() {
        return idStudnt;
    }

    public float getBursa() {
        return bursa;
    }

    public void setBursa(float bursa) {
        this.bursa = bursa;
    }

    @Override
    public float calculareVenit() {
        return this.bursa;
    }
}
