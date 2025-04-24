package ro.cts.program;

import ro.cts.clase.Facade;
import ro.cts.clase.Masa;
import ro.cts.clase.Ospatar;
import ro.cts.clase.Picolo;

public class Program {

    public static void main(String[] args) {
        Masa masa=new Masa(4,true);

        //Aici am exemplificat gradul de timp irosit si incalcarea a dry(cred ca asa ii zice)
//        Picolo picolo=new Picolo();
//        Ospatar ospatar=new Ospatar();
//
//        if(masa.isEsteLibera())
//        {
//            if(picolo.debaraseazaMasa(masa))
//            {
//                if(ospatar.esteAranjata(masa))
//                    System.out.println("Luati loc la masa "+masa.getNumarMasa());
//                else {
//                    System.out.println("Asteptati putin ca sa fie aranjata masa "+masa.getNumarMasa());
//                }
//            }
//            else
//            {
//                System.out.println("Asteptati ca tocmai s a ridicat cineva de la masa "+masa.getNumarMasa());
//
//            }
//        }
//        else {
//            System.out.println("Nu avem locuri libere");
//        }

        Facade telefon=new Facade();
        System.out.println(telefon.verificaAsezareMasa(masa));
        Masa masaNoua =new Masa(7,true);
        System.out.println(telefon.verificaAsezareMasa(masaNoua));
        Masa masaNoua2 =new Masa(8,false);
        System.out.println(telefon.verificaAsezareMasa(masaNoua2));


    }

}
