package ro.cts.clase;

public abstract class InfoMijloc {
    private InfoMijloc urmatorul;

    public void setUrmatorul(InfoMijloc urmatorul) {
        this.urmatorul = urmatorul;
    }

    public InfoMijloc getUrmatorul() {
        return urmatorul;
    }

    public abstract void recomandareMijloc(int distanta);
}
