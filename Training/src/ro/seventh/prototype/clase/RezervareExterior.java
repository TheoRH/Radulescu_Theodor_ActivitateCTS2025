package ro.seventh.prototype.clase;

public class RezervareExterior extends AbstractRezervare {

    private boolean esteFumator;

    public RezervareExterior() {
        super();
        this.esteFumator = false;
    }

    public RezervareExterior(int nrParticipanti, int ora, String numeClient, int ziualUnii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziualUnii);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare clone(int ziuaLunii) {
        RezervareExterior r = new RezervareExterior();
        r.nrParticipanti = nrParticipanti;
        r.ora = ora;
        r.numeClient = numeClient;
        r.ziualUnii = ziuaLunii;
        r.esteFumator = esteFumator;
        return r;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareExterior{");
        sb.append("esteFumator=").append(esteFumator);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziualUnii=").append(ziualUnii);
        sb.append('}');
        return sb.toString();
    }
}
