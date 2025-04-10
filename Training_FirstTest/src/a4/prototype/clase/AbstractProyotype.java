package a4.prototype.clase;

public abstract class AbstractProyotype {

    protected String denumire;
    protected String incrediente;

    public AbstractProyotype() {
        denumire = "";
        incrediente = "";
    }

    public AbstractProyotype(String denumire, String incrediente) {
        if(incrediente.length()<2)
            this.incrediente = "nimic";
        else
            this.incrediente = incrediente;
        this.denumire = denumire;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractProyotype{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", incrediente='").append(incrediente).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractProyotype clone(float cantitate);
}
