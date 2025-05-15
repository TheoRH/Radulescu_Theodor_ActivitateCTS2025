package ro.cts.clase;

public class Tramvai extends InfoMijloc {

    @Override
    public void recomandareMijloc(int distanta) {
        if(distanta<10) {
            System.out.println("Calatorul va lua tramvaiul");
        }
        else {
            this.getUrmatorulTransport().recomandareMijloc(distanta);
        }
    }
}
