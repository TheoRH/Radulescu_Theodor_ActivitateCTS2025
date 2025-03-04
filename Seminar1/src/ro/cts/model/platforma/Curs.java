package ro.cts.model.platforma;

import ro.cts.model.personal.IPredabil;
import ro.cts.model.personal.Persoana;
import ro.cts.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public int getCredite() {
        return credite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void sustineExamen(String data){
        StringBuilder str = new StringBuilder();
        str.append("Prfesorul ").append(((Persoana)this.profesor).getNume()).append( " are examen la ").append(this.numeCurs).append(" in data de: ").append(data).append(" cu urmatorii studenti:");
        System.out.println(str.toString());

        for (Student student : studenti) {
            System.out.println(student.getNume());
        }
    }
}
