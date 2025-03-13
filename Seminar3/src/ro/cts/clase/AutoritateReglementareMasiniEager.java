package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String denumire;
    private String website;
    private int numarReglementari;
    private static AutoritateReglementareMasiniEager instance=new AutoritateReglementareMasiniEager("Autoritatea","www.autoritatea.eu",2001);

    private AutoritateReglementareMasiniEager(String denumire, String website, int numarReglementari) {
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

    public static AutoritateReglementareMasiniEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", numarReglementari=").append(numarReglementari);
        sb.append('}');
        return sb.toString();
    }
}
