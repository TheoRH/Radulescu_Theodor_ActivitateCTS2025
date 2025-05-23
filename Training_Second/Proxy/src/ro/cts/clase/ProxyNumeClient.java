package ro.cts.clase;

public class ProxyNumeClient implements IRezervare {
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(int numarPersoane, String nume) {
        if(nume.length()>=5)
            this.rezervare.realizareRezervare(numarPersoane,nume);
        else
            System.out.println("Nu este posibila rezervare");
    }
}
