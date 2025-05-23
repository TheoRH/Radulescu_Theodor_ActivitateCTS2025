package ro.cts.program;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        InfoMijloc autobuz= new Autobuz();
        InfoMijloc troleibuz= new Troleibuz();
        InfoMijloc tramvai = new Tramvai();
        InfoMijloc metrou = new Metrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        troleibuz.recomandareMijloc(5);
        troleibuz.recomandareMijloc(2);
        troleibuz.recomandareMijloc(12);
        troleibuz.recomandareMijloc(4);
        troleibuz.recomandareMijloc(3);
        troleibuz.recomandareMijloc(15);

    }
}
