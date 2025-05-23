package ro.cts.program;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaAnNou;
import ro.cts.clase.NotaCraciun;
import ro.cts.clase.NotaPlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150);
        Nota notaDecorata = new NotaAnNou(nota);

        notaDecorata.printare();

        System.out.println();

        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
    }
}
