package ro.seventh.prototype.clase;

public class RezervareInterior extends AbstractRezervare {
    private boolean esteLaParter;

    public RezervareInterior(){
        super();
        this.esteLaParter = false;
    }

    @Override
    public AbstractRezervare clone(int ziuaLunii) {
        RezervareInterior r = new RezervareInterior();
        r.ziualUnii = ziuaLunii;
        r.esteLaParter = esteLaParter;
        r.numeClient = numeClient;
        r.ziualUnii = ziualUnii;
        r.ora = ora;
        r.nrParticipanti = nrParticipanti;
        return r;
    }

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziualUnii=").append(ziualUnii);
        sb.append('}');
        return sb.toString();
    }
}
