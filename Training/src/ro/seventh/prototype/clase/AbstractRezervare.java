package ro.seventh.prototype.clase;

public abstract class AbstractRezervare {
    protected int nrParticipanti;
    protected int ora;
    protected String numeClient;
    protected int ziualUnii;

    public AbstractRezervare(){
        nrParticipanti = 0;
        ora = 0;
        numeClient = "";
        ziualUnii = 0;
    }

    public AbstractRezervare(int nrParticipanti, int ora, String numeClient, int ziualUnii) {
        if (nrParticipanti < 2){
            this.nrParticipanti = 2;
        }
        else {
            this.nrParticipanti = nrParticipanti;
        }
        if(ora >= 10 && ora <= 22){
            this.ora = ora;
        }
        else {
            this.ora = 12;
        }
        if(numeClient.length() > 2){
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "Anonim";
        }
        if(ziualUnii >=1 && ziualUnii < 31){
            this.ziualUnii = ziualUnii;
        }
        else {
            this.ziualUnii = 1;
        }
    }

    public void ziualUnii(int ziualUnii) {
        this.ziualUnii = ziualUnii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziualUnii);
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractRezervare clone(int ziuaLunii) ;
}
