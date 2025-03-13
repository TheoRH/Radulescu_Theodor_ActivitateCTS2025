package ro.cts.reglementare;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String denumire;
    private String webite;
    private Map<String,Reglementare> map = new HashMap<String,Reglementare>();
    private static Autoritate instance=null;


    private Autoritate(String denumire, String webite) {
        this.denumire = denumire;
        this.webite = webite;
    }

    public Reglementare reglementeazaModel(String denumire) {
       if(!map.containsKey(denumire))
       {
           map.put(denumire,new Reglementare(denumire,map.size()+1,new Date().toString()));
       }
        return map.get(denumire);
    }

    public static Autoritate getInstance(String denumire){
        if(instance==null)
        {
            instance = new Autoritate(denumire,"www.nimic.to");
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autoritate{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", webite='").append(webite).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
