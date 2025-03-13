package ro.cts.clase;

public class AutoritateReglementareMasiniLazy {
    private String denumire;
    private String website;
    private int numarReglementari;
    private static AutoritateReglementareMasiniLazy instance=null;

    private AutoritateReglementareMasiniLazy(String denumire, String website, int numarReglementari) {
        this.denumire = denumire;
        this.website = website;
        this.numarReglementari = numarReglementari;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String denumire){
        numarReglementari++;
    }

    public synchronized static AutoritateReglementareMasiniLazy getInstance(String denumire, String website) {
        if(instance==null) {
            instance=new AutoritateReglementareMasiniLazy(denumire, website,0);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", numarReglementari=").append(numarReglementari);
        sb.append('}');
        return sb.toString();
    }
}
