package a2.simpleFactory.clase;

public class Asistent extends PersonalSpital {

    public Asistent(String nume, float salariul) {
        super(nume, salariul);
    }

    @Override
    public void descriere() {
        System.out.println("Asistent");
    }


}



