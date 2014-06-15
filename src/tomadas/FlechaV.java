package tomadas;

/**
 *
 * @author Renan
 */
public class FlechaV implements ITomadaV {

    @Override
    public void insert(String str) {
        System.out.println("Ligando flecha velha em ? " + str);
    }
}
