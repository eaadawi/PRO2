package opg4;

public class SpiritusAdapter extends Vare{
    private Spiritus spiritus;

    public SpiritusAdapter(Spiritus spiritus) {
        super(spiritus.getPrisen(), spiritus.getBetgenelse());
        this.spiritus = spiritus;
    }

    @Override
    public double beregnMoms() {
        return spiritus.hentMoms();
    }

    @Override
    public int getPris() {
        return spiritus.getPrisen();
    }

    @Override
    public void setPris(int pris) {
        spiritus.setPrisen(pris);
    }

    @Override
    public String getNavn() {
        return spiritus.getBetgenelse();
    }

    @Override
    public void setNavn(String navn) {
        spiritus.setBetgenelse(navn);
    }
}
