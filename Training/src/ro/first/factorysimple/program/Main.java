package ro.first.factorysimple.program;

import ro.first.factorysimple.clase.AgentieFactory;
import ro.first.factorysimple.clase.PachetTuristic;
import ro.first.factorysimple.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory factory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        try{
            pachetTuristic=factory.createPachet(TipPachet.pachetCazareSiTransport);
        }catch(Exception e){
            e.printStackTrace();
        }
        pachetTuristic.descriere();
    }
}
