/*
 *  NOME            : SISTEMA DE TRANSITO
 *  DATA            : 17/11/2022
 *  PROGRAMADOR     : MAICON
 */
package sistema_de_transito;

import javax.swing.JOptionPane;
import java.io.*;

public class ClasseMetodos {

    public Transito[] FCADRASTRAESTATISTICA(Transito[] transito) throws IOException {
        int i;
        String arquivo = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(arquivo));

        for (i = 0; i < 10; i++) {
            transito[i] = new Transito();
        }

        for (i = 0; i < 10; i++) {
            transito[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o Codigo da Cidade"));
            gravar.write(Integer.toString(transito[i].CodigoCidade));
            gravar.newLine();
            transito[i].NomeCidade = JOptionPane.showInputDialog("Insira o Nome da Cidade");
            gravar.write(transito[i].NomeCidade);
            gravar.newLine();
            transito[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a Qauntidade de Acidentes"));
            gravar.write(Integer.toString(transito[i].QtdAcidentes));
            gravar.newLine();
        }

        System.out.println("CADASTRO FEITO COM SUCESSO ");
        gravar.close();
        return transito;
    }

    public void PQTDACIDENTES(Transito[] transito) throws IOException {
        int i;
        String arquivo = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(arquivo));

        for (i = 0; i < 10; i++) {
            transito[i] = new Transito();
        }

        for (i = 0; i < 10; i++) {
            transito[i].CodigoCidade = Integer.parseInt(ler.readLine());
            transito[i].NomeCidade = ler.readLine();
            transito[i].QtdAcidentes = Integer.parseInt(ler.readLine());
        }

        for (i = 0; i < 10; i++) {
            if (transito[i].QtdAcidentes > 100 && transito[i].QtdAcidentes < 500) {
                JOptionPane.showMessageDialog(null, "( " + transito[i].CodigoCidade + " ) " + transito[i].NomeCidade + ": " + transito[i].QtdAcidentes);
            }
        }
        ler.close();
    }

    public void PMAIORMENOR(Transito[] transito) throws IOException {
        int i, maior, menor;
        String arquivo = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(arquivo));

        for (i = 0; i < 10; i++) {
            transito[i] = new Transito();
        }

        for (i = 0; i < 10; i++) {
            transito[i].CodigoCidade = Integer.parseInt(ler.readLine());
            transito[i].NomeCidade = ler.readLine();
            transito[i].QtdAcidentes = Integer.parseInt(ler.readLine());
        }

        maior = 0;
        menor = 0;

        for (i = 0; i < 10; i++) {
            if (transito[i].QtdAcidentes > transito[maior].QtdAcidentes) {
                maior = i;
            }
            if (transito[i].QtdAcidentes < transito[menor].QtdAcidentes) {
                menor = i;
            }
        }

        JOptionPane.showMessageDialog(null, "A menor quantidade de acidentes foi em: ( " + transito[menor].CodigoCidade + " ) " + transito[menor].NomeCidade + ": " + transito[menor].QtdAcidentes + "\n A maior quantidade de acidentes foi em: ( " + transito[maior].CodigoCidade + " ) " + transito[maior].NomeCidade + ": " + transito[maior].QtdAcidentes);
        ler.close();
    }

    public void PACIMA(Transito[] transito) throws IOException {
        int i, media = 0;
        String arquivo = "ArquivoEstatistica.txt";
        BufferedReader ler = new BufferedReader(new FileReader(arquivo));

        for (i = 0; i < 10; i++) {
            transito[i] = new Transito();
        }

        for (i = 0; i < 10; i++) {
            transito[i].CodigoCidade = Integer.parseInt(ler.readLine());
            transito[i].NomeCidade = ler.readLine();
            transito[i].QtdAcidentes = Integer.parseInt(ler.readLine());
        }

        for (i = 0; i < 10; i++) {
            media += transito[i].QtdAcidentes;
        }

        media /= i;

        for (i = 0; i < 10; i++) {
            if (transito[i].QtdAcidentes > media) {
                JOptionPane.showMessageDialog(null, "Cidade acima da média de acidentes ( " + transito[i].CodigoCidade + " ) " + transito[i].NomeCidade + ": " + transito[i].QtdAcidentes);
            }
            ler.close();
        }

    }
}
