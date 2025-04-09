package a1.builderv2.program;

import a1.builderv2.clase.Pacient;
import a1.builderv2.clase.SpitalBuilder;

public class Program {
    public static void main(String[] args) {
        SpitalBuilder builder = new SpitalBuilder();
        Pacient pacient = builder.setHasMicDejun(true).build("Marius");
        Pacient pacient2 = builder.setHasHalatPentruInterior(true).build("Popica");
        System.out.println(pacient);
        System.out.println(pacient2);
    }
}
