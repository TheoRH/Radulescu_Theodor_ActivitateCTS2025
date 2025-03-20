package ro.first.factorysimple.clase;

public class AgentieFactory {

    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet) {
            case pachetCazareSiTransport:
                return new PachetCazareTransport();
            case pacehtTransport:
                return new PachetTransport();
            case pachetCazare:
                return new PachetCazare();
            default:
                throw new Exception("Pachet unknown");
        }
    }
}
