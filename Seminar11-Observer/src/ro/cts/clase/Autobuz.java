package ro.cts.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void plecaDeLaCapat() {
        trimiteMesaj("Autobuzul"+ this.getNumarLinie() +"pleaca de la capatul liniei");
    }

    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul numarul "+ this.getNumarLinie() +" va circula astazi prin Bd. Balcescu si nu va mai opri la statia Piata Romana");

    }

}
