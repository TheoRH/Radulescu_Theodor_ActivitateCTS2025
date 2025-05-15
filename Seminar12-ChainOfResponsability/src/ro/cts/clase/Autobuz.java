package ro.cts.clase;

public class Autobuz extends InfoMijloc {

    @Override
    public void recomandareMijloc(int distanta) {
        if(distanta<5)
        {
            System.out.println("Calatourul va lua autobuzul");

        }
        else
        {
            this.getUrmatorulTransport().recomandareMijloc(distanta);
        }
    }

}
