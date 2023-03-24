/*
 *  NOME            : SISTEMA DE TRANSITO
 *  DATA            : 17/11/2022
 *  PROGRAMADOR     : MAICON
 */
package sistema_de_transito;

import javax.swing.JOptionPane;
import java.io.IOException;

public class ClassePrincipal {

    public static void main(String[] args) throws IOException {
        Transito[] transito = new Transito[10];
        ClasseMetodos m = new ClasseMetodos();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes  \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 9 - Finaliza"));
            switch (opc) {
                case 1:
                    transito = m.FCADRASTRAESTATISTICA(transito);
                    break;
                case 2:
                    m.PQTDACIDENTES(transito);
                    break;
                case 3:
                    m.PMAIORMENOR(transito);
                    break;
                case 4:
                    m.PACIMA(transito);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FINALIZADO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }
}
