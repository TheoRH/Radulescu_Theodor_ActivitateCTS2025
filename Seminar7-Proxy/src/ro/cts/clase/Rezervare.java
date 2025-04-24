package ro.cts.clase;

public class Rezervare implements IRezervare {

    public Rezervare() {

    }


    @Override
    public void realizareRezervare(int numarPersoane, String nume) {
        System.out.println("Rezervare realizata pentru "+numarPersoane+" pe numele"+nume);
    }
}
