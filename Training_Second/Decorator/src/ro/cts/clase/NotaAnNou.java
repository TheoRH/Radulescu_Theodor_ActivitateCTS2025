package ro.cts.clase;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("AnNouFericit");
    }
}
