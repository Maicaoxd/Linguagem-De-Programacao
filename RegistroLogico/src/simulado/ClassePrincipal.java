/*
 *  NOME            : SISTEMA DE VEICULOS
 *  DATA            : 30/11/2022
 *  PROGRAMADOR     : MAICON
 */
package simulado;

import javax.swing.JOptionPane;
import java.io.IOException;

public class ClassePrincipal {

    public static void main(String[] args) throws IOException {
        Veiculo[] veiculo = new Veiculo[5];
        ClasseMetodos m = new ClasseMetodos();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Busca por ano \n 2 - Mostrar Valor limite \n 9 - Sair"));
            switch (opc) {
                case 1:
                    veiculo = m.FLer(veiculo);
                    m.PBUSCA(veiculo);
                    break;
                case 2:
                    veiculo = m.FLer(veiculo);
                    m.PLIMITE(veiculo);
                    break;
            }
        }
    }
}
