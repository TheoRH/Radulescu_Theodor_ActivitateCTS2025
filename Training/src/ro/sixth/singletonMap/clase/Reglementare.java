package ro.sixth.singletonMap.clase;

public class Reglementare {
    private String model;
    private int nrReglementare;
    private String data;

    protected Reglementare(String model, int nrReglementare, String data) {
        this.model = model;
        this.nrReglementare = nrReglementare;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reglementare{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrReglementare=").append(nrReglementare);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
