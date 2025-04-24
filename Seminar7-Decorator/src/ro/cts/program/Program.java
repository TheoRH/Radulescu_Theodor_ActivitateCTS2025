package ro.cts.program;

import ro.cts.clase.*;

public class Program {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150);

        Nota notaDecorata = new NotaAnNou(nota);
        notaDecorata.printare();

        System.out.println();

        Nota notaCraciun = new NotaCraciun(notaDecorata); //decorare multipla
        notaCraciun.printare();


    }
}
