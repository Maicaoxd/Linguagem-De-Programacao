/*
 *  NOME            : SISTEMA DE TRANSITO
 *  DATA            : 17/11/2022
 *  PROGRAMADOR     : MAICON
 */
package sistema_de_transito;

public class Transito {

    int CodigoCidade;
    String NomeCidade;
    int QtdAcidentes;

    Transito() {
        this(0, "", 0);
    }

    Transito(int CodigoCidadeB, String NomeCidadeB, int QtdAcidentesB) {
        CodigoCidade = CodigoCidadeB;
        NomeCidade = NomeCidadeB;
        QtdAcidentes = QtdAcidentesB;
    }
}
