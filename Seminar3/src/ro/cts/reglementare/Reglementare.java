package ro.cts.reglementare;

public class Reglementare {
    private String model;
    private int nrRegelemntare;
    private String data;

    protected Reglementare(String model, int nrRegelemntare, String data) {
        this.model = model;
        this.nrRegelemntare = nrRegelemntare;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reglementare{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrRegelemntare=").append(nrRegelemntare);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
