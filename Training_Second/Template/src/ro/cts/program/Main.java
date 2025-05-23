package ro.cts.program;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Andrei",5);
        TemplateInternare spital = new SpitalPublic("Spital public");
        spital.internare(pacient);
        TemplateInternare spitalPrivat = new SpitalPrivat();
        spitalPrivat.internare(pacient);
    }
}
