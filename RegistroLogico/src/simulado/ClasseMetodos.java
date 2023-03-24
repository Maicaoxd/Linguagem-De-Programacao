/*
 *  NOME            : SISTEMA DE VEICULOS
 *  DATA            : 30/11/2022
 *  PROGRAMADOR     : MAICON
 */
package simulado;

import java.io.*;

public class ClasseMetodos {

    public Veiculo[] FLer(Veiculo[] veiculo) throws IOException {
        int i;
        String arquivo = "veiculos.txt";
        BufferedReader ler = new BufferedReader(new FileReader(arquivo));

        for (i = 0; i < 5; i++) {
            veiculo[i] = new Veiculo();
        }

        for (i = 0; i < 5; i++) {
            veiculo[i].Modelo = ler.readLine();
            veiculo[i].Cor = ler.readLine();
            veiculo[i].Ano = Integer.parseInt(ler.readLine());
            veiculo[i].Valor = Integer.parseInt(ler.readLine());
        }
        ler.close();
        return veiculo;
    }

    public void PBUSCA(Veiculo[] veiculo) throws IOException {
        int i, j, aux;
        String Aux;
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                if (veiculo[i].Ano <= veiculo[j].Ano) {
                    aux = veiculo[i].Ano;
                    veiculo[i].Ano = veiculo[j].Ano;
                    veiculo[j].Ano = aux;
                    
                    aux = veiculo[i].Valor;
                    veiculo[i].Valor = veiculo[j].Valor;
                    veiculo[j].Valor = aux;
                    
                    Aux = veiculo[i].Cor;
                    veiculo[i].Cor = veiculo[j].Cor;
                    veiculo[j].Cor = Aux;
                    
                    Aux = veiculo[i].Modelo;
                    veiculo[i].Modelo = veiculo[j].Modelo;
                    veiculo[j].Modelo = Aux;
                }
            }
        }
        
        for (i = 0;i<10;i++){
            System.out.print(veiculo[i].Ano+" ,");
        }
        System.out.println("CONSULTA DOS 10 VEICULOS MAIS ANTIGOS REALIZADOS NO CADASTRO");
    }
    
    public void PLIMITE(Veiculo[] veiculo){
        
    }
}