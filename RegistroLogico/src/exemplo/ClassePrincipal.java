package exemplo;

import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {

    public static void main(String[] args) throws IOException {
        Aluno[] aluno = new Aluno[10];
        ClasseMetodos m = new ClasseMetodos();
        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Gravar Aluno \n 2 - Ler Aluno  \n 9 - Finaliza"));
            switch (opc) {
                case 1:
                    aluno = m.GravaAluno(aluno);
                    break;
                case 2:
                    m.LerAluno(aluno);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FINALIZADO ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }
}
