package tomadas;

/**
 *
 * @author Renan
 */
public class adaptador {

    public static void main(String args[]) {
// Criando tomadas e flechas.
        FlechaN tomadaN = new FlechaN();
        FlechaV tomadaV = new FlechaV();
// Ligar tomada velha com flecha velha.
        tomadaV.insert("Tomada padrão velho.");
// Ligando tomada com adaptador.
        ITomadaV tomadaNSquare = new AdapterTomada(tomadaN);
        tomadaNSquare.insert("Tomada padrão velho com adaptador.");
// Ligar tomada nova com flecha nova.
        tomadaN.insertIntoHole("Tomada padrão nova.");
// Ligando tomada com adaptador.
        ITomadaN tomadaVToRound = new AdapterTomada(tomadaV);
        tomadaVToRound.insertIntoHole("Tomada padrão novo com adaptador.");
    }

}
