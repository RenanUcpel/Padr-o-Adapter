package tomadas;

/**
 *
 * @author Renan
 */
public class AdapterTomada implements ITomadaV, ITomadaN {

    private FlechaN tomadaN;
    private FlechaV tomadaV;

    public AdapterTomada(FlechaN peg) {
        this.tomadaN = peg;
    }

    public AdapterTomada(FlechaV peg) {
        this.tomadaV = peg;
    }

    @Override
    public void insert(String str) {
        tomadaN.insertIntoHole(str);
    }

    @Override
    public void insertIntoHole(String msg) {
        tomadaV.insert(msg);
    }
}
