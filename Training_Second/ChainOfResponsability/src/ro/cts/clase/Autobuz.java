package ro.cts.clase;

public class Autobuz extends InfoMijloc {
    @Override
    public void recomandareMijloc(int distanta) {
        if (distanta < 5) {
            System.out.println("Calatorul autobuz");
        } else
            this.getUrmatorul().recomandareMijloc(distanta);
    }
}
