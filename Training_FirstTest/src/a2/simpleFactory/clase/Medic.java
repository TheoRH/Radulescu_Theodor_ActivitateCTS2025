package a2.simpleFactory.clase;

public class Medic extends PersonalSpital{

    public Medic(String nume, float salariul) {
        super(nume, salariul);
    }



    @Override
    public void descriere() {
        System.out.println(super.toString()+"Medic");
    }
}
