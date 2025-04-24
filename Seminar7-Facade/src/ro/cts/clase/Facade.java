package ro.cts.clase;

public class Facade {
    public String verificaAsezareMasa(Masa masa){
        Picolo picolo=new Picolo();
        Ospatar ospatar=new Ospatar();

        if(masa.isEsteLibera())
        {
            if(picolo.debaraseazaMasa(masa))
            {
                if(ospatar.esteAranjata(masa))
                    return "Luati loc la masa "+masa.getNumarMasa();
                else {
                    return "Asteptati putin ca sa fie aranjata masa "+masa.getNumarMasa();
                }
            }
            else
            {
                return "Asteptati ca tocmai s a ridicat cineva de la masa "+masa.getNumarMasa();

            }
        }
        else {
            return "Nu avem locuri libere";
        }
    }
}
