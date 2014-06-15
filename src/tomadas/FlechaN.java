package tomadas;

/**
 *
 * @author Renan
 */
public class FlechaN implements ITomadaN {

    @Override
    public void insertIntoHole(String msg) {
        System.out.println("Ligando flecha nova em ? " + msg);
    }
}
