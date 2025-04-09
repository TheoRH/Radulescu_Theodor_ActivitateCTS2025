package ro.fourth.singletonEager.program;

import ro.fifth.singletonLazy.clase.AutoritateReglementareaMasiniLazy;
import ro.fourth.singletonEager.clase.AutoritateReglemtareaMasiniEager;

public class Main {
    public static void main(String[] args) {
        AutoritateReglemtareaMasiniEager autoritate1 = AutoritateReglemtareaMasiniEager.getInstance();
        System.out.println(autoritate1);
        autoritate1.setDenumire("Popica");
        System.out.println(autoritate1);

        AutoritateReglementareaMasiniLazy autoritate2= AutoritateReglementareaMasiniLazy.getInstance("Popica",500);
        System.out.println(autoritate2);
        autoritate2.setDenumire("Marius");
        AutoritateReglementareaMasiniLazy autoritate3= AutoritateReglementareaMasiniLazy.getInstance("Ionut",500);
        System.out.println(autoritate3);
        System.out.println(autoritate2);
    }
}
