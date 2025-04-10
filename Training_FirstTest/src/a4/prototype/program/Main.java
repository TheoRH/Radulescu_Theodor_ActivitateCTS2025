package a4.prototype.program;

import a4.prototype.clase.AbstractProyotype;
import a4.prototype.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        AbstractProyotype abstractProyotype=new Reteta("Medicament","Nimick",50);
        AbstractProyotype abstractProyotype2=abstractProyotype.clone(600);
        System.out.println(abstractProyotype);
        System.out.println(abstractProyotype2);
    }
}
