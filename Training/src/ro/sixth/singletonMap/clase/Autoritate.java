package ro.sixth.singletonMap.clase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String denumire;
    private String website;
    private Map<String,Reglementare> map = new HashMap<String, Reglementare>();
    private static Autoritate instance = null;

    public Autoritate(String denumire, String website) {
        this.denumire = denumire;
        this.website = website;
    }

    public Reglementare reglementeazaModel(String model){
        if(!map.containsKey(model)){
            map.put(model,new Reglementare(model,map.size()+1,new Date().toString()));
        }
        return map.get(model);
    }

    public static synchronized Autoritate getInstance(String denumire){
        if(instance == null){
            instance = new Autoritate(denumire,"www.test.ro");
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autoritate{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", map=").append(map);
        sb.append('}');
        return sb.toString();
    }
}
