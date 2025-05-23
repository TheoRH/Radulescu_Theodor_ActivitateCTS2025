package ro.cts.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void plecaDeLaCapat() {
        trimiteMesaj("Autobuz" +this.getNumarLinie()+"PLECA DE LA CAPAT" );


    }

    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul numarl "+this.getNumarLinie()+" va circula astrazi prin x");
    }
}
