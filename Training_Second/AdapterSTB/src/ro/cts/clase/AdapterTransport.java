package ro.cts.clase;

public class AdapterTransport extends Metrou {
    private Autobuz Autobuz;
    public AdapterTransport(Autobuz Autobuz) {
        super(Autobuz.getDenumire(),101);
        this.Autobuz = Autobuz;
    }

    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
}
