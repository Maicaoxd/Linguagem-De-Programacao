/*
 *  NOME            : SISTEMA DE VEICULOS
 *  DATA            : 30/11/2022
 *  PROGRAMADOR     : MAICON
 */
package simulado;

public class Veiculo {
    
    String Modelo;
    String Cor;
    int Ano;
    int Valor;
    
    Veiculo() {
        this("", "", 0, 0);
    }
    
    Veiculo(String ModeloB, String CorB, int AnoB, int ValorB){
        Modelo = ModeloB;
        Cor = CorB;
        Ano = AnoB;
        Valor = ValorB;
    }
}
