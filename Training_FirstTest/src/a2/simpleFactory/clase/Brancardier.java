package a2.simpleFactory.clase;

public class Brancardier extends PersonalSpital{


    public Brancardier(String nume, float salariul) {
        super(nume, salariul);

    }


    @Override
    public void descriere() {
        System.out.println(super.toString()+"Brancardier");
    }
}
