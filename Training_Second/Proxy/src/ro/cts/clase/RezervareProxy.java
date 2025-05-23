package ro.cts.clase;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;
    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(int numarPersoane, String nume) {
        if(numarPersoane >4) {
            rezervare.realizareRezervare(numarPersoane,nume);
        }
        else {
            System.out.println("Nu este posibila rezervarea");
        }
    }
}
