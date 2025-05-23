package ro.cts.clase;

public class Troleibuz extends InfoMijloc {

    @Override
    public void recomandareMijloc(int distanta) {
        if (distanta < 3) {
            System.out.println("Calatorul va alege troleibuzul");
        } else
            this.getUrmatorul().recomandareMijloc(distanta);
    }
}
