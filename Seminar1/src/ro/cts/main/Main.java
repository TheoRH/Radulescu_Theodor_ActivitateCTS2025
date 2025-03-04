package ro.cts.main;

import ro.cts.model.personal.*;
import ro.cts.model.platforma.Curs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<Student>();
        studenti.add(new Student("Ionica Popica",22,"1",213));
        studenti.add(new Student("Ana",23,"2",455));
        Curs curs = new Curs("CTS", 4, new Profesor("Adirna", 45, "22",4500, 0.35f),studenti);
        curs.sustineExamen("12/02/2025");

        curs.getProfesor().preda();
        System.out.println("Venitul profesorului este: " + ((Persoana)curs.getProfesor()).calculareVenit());
        curs.setProfesor(new Asistent("Marinica", 22, "23",1200));
        curs.sustineExamen("03/02/2025");

        curs.setProfesor(new Lector("Gigel",32));
        curs.sustineExamen("04/02/2025");

    }
}