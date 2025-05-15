package ro.cts.clase;

public abstract class InfoMijloc {

    private InfoMijloc urmatorulTransport;

    public void setTransport(InfoMijloc transport) {
        this.urmatorulTransport = transport;
    }

    public InfoMijloc getUrmatorulTransport() {
        return urmatorulTransport;
    }

    public abstract void recomandareMijloc(int distanta);
}
