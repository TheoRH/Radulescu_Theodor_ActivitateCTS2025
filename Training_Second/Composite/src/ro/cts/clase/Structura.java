package ro.cts.clase;

public interface Structura {
    void adaugaStructura(Structura structuri) throws Exception;
    void stergeStrucutra(Structura structuri) throws Exception;
    void afiseazaDescriere();
    Structura getStructura(int index) throws Exception;
}
