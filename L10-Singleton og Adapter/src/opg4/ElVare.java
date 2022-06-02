package opg4;

public class ElVare extends Vare{
    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        if(getPris() * 0.3 > 3)
            return getPris() * 0.3;
        return 3;
    }
}
