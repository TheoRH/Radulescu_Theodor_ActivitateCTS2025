package ro.eleventh.factoryMethod.clase;

public interface AbstractFactory {
    public FelDeMancare createFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii);
}
