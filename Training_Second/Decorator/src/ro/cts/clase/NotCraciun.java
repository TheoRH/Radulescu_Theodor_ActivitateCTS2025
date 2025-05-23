package ro.cts.clase;

public class NotCraciun extends NotaDecorata{

    public NotCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("CraciunFericit");
    }
}
