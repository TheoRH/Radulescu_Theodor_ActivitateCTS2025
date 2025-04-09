package ro.eleventh.factoryMethod.clase;



public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema){
        this.crema = crema;
    }


    @Override
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch (tipFelDeMancare) {
            case Deserturi.Tiramisu:
                return new Tirmaisu(pret, calorii, crema);
            case Deserturi.Papanasi:
                return new Papanasi(pret, calorii, crema);
            default:
                return null;
        }
    }
}
