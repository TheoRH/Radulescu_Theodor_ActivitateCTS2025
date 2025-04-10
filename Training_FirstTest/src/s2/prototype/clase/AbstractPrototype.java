package s2.prototype.clase;

public abstract class AbstractPrototype {

    private String dimensiuni;
    private String modelMasina;
    private int anFabricatie;

    public AbstractPrototype(String dimensiuni, String modelMasina, int anFabricatie) {
        this.dimensiuni = dimensiuni;
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }



    public abstract AbstractPrototype clone();
}
