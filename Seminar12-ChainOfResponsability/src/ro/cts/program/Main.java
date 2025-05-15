package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc autobuz = new Autobuz();
        InfoMijloc troleibuz = new Troleibuz();
        InfoMijloc tramavi = new Tramvai();
        InfoMijloc metrou = new Metrou();

        troleibuz.setTransport(autobuz);
        autobuz.setTransport(tramavi);
        tramavi.setTransport(metrou);

        troleibuz.recomandareMijloc(5);
        troleibuz.recomandareMijloc(2);
        troleibuz.recomandareMijloc(12);
        troleibuz.recomandareMijloc(4);
        troleibuz.recomandareMijloc(3);




    }
}
