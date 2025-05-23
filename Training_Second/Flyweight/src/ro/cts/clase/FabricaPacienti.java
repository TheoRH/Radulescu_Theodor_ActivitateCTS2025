package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {

    private HashMap<String, PacientAbstract> pacients;

    public FabricaPacienti() {
        this.pacients = new HashMap<String,PacientAbstract>();
    }

    public PacientAbstract getPacient(String numarTelefon) throws Exception {
        PacientAbstract pacient = this.pacients.get(numarTelefon);
        if(pacient == null)
        {
            throw new Exception("Numarul nu a fost gasit");
        }
        else {
            return pacient;
        }
    }

    public PacientAbstract getPacient(String nume, String telefon, String adresa){
        PacientAbstract pacient = this.pacients.get(telefon);
        if(pacient == null)
        {
            pacient = new Pacient(nume, telefon, adresa);
            pacients.put(telefon, pacient);
            System.out.println("Pacient adaugat cu succes");
        }
        return pacient;
    }
}
