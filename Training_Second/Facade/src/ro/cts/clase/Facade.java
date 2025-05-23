package ro.cts.clase;

public class Facade {
    public String verificaAsezareMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if(masa.isEsteLibera())
        {
            if(picolo.debaraseazaMasa(masa))
            {
                if(ospatar.esteAranajta(masa))
                    return "Luati loc la masa "+ masa.getNumarMasa();
                else
                    return "Astepti putin ca sa fie aranjata masa "+masa.getNumarMasa();
            }
            else
                return "Asteptati ca tocmai s a ridicat cineva de la masa "+masa.getNumarMasa();
        }
        else
            return "NU avem locuri libere";
    }
}
