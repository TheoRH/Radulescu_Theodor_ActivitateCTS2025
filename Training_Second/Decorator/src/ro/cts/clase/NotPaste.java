package ro.cts.clase;

public class NotPaste extends NotaDecorata{

    public NotPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("PasteFericit");
    }
}
