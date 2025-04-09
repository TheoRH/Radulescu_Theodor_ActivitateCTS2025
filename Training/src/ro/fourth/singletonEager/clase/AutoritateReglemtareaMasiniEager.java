package ro.fourth.singletonEager.clase;

public class AutoritateReglemtareaMasiniEager {
    private String denumire;
    private float nrMasini;
    private static AutoritateReglemtareaMasiniEager instance = new AutoritateReglemtareaMasiniEager("Autoritatea",200);

    private AutoritateReglemtareaMasiniEager(String denumire, float nrMasini) {
        this.denumire = denumire;
        this.nrMasini = nrMasini;
    }
    public static AutoritateReglemtareaMasiniEager getInstance(){
        return instance;
    }
    public void setDenumire(String denumire){
        this.denumire = denumire;
    }

    public void setNrMasini(float nrMasini) {
        this.nrMasini = nrMasini;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglemtareaMasiniEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrMasini=").append(nrMasini);
        sb.append('}');
        return sb.toString();
    }
}
