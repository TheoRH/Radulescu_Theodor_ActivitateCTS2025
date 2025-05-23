package ro.cts.clase;

public class Rezervare implements IRezervare {
    public Rezervare() {
    }

    @Override
    public void realizareRezervare(int numarPersoane, String nume) {
        System.out.println("Rezervarea realizata pentr "+numarPersoane+" pe numele "+nume);
    }
}
