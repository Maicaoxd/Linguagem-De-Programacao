package exerc18_29;

/*
 *   NOME            : EXERCÍCIOS 18 A 29
 *   DATA            : 21/08/2022
 *   PROGRAMADOR     : MAICON
 */
import javax.swing.JOptionPane;
public class Exercs18_29 {
    public static void main(String[] args) {
        int Exerc;
        Exerc = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Exercicio"));
        switch (Exerc) {
            case 18:
/*              Receba 2 valores inteiros. Calcule e mostre o resultado
 *              da diferença do maior pelo menos valor.
 */             int X, Y, D;
                X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
                Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
                if (X>Y) {
                    D = (X-Y);
                    System.out.println("A diferença e de: "+D);
                }
                else {
                    D = (Y-X);
                    System.out.println("A diferença e de: "+D);
                }
            break;
            case 19:
/*              Receba 2 valores reais. Calcule e mostre o maior deles.
 */             double A, B;
                A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
                B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
                if (A > B) {
                    System.out.println(+A+" E maior que "+B);
                }
                else if (B > A) {
                    System.out.println(+B+" E maior que "+A);
                }
                else {
                    System.out.println(+A+" E igual a "+B);
                }
            break;
            case 20:
/*              Receba 3 coeficientes A, B, e C de uma equação do 2º grau
 *              da fórmula AX²+BX+C=0. Verifique e mostre a existência de 
 *              raízes reais e se caso exista, calcule e mostre.
 */             int A20, B20, C20; 
                double D20, X1, X2;
                A20 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
                B20 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
                C20 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
                D20 = (double) ((B20*B20)-4*A20*C20);
                if (D20 >= 0) {
                    X1 = (double) ((-B20+Math.sqrt(D20))/(2*A20));
                    X2 = (double) ((-B20-Math.sqrt(D20))/(2*A20));        
                    System.out.println("O valor de X1 e de: "+X1);
                    System.out.println("O valor de X2 e de: "+X2);
                }
                else {
                    System.out.println("Delta e igual a: "+D20+ " logo, nao e possivel realizar o calculo");
                }
            break;
            case 21:
/*              Receba 4 notas bimestrais de um aluno. Calcule e mostre a
 *              média aritmética. Mostre a mensagem de acordo com a média:
 *               
 *              a. Se a média for >= 6,0 exibir “APROVADO”;
 *              b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 *              c. Se a média for < 3,0 exibir “RETIDO”.
 */             double N1, N2, N3, N4, M;
                N1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 1"));
                N2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 2"));
                N3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 3"));
                N4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 4"));
                M = (double) ((N1+N2+N3+N4)/4);
                if (M >= 6.0) {
                    System.out.println("APROVADO");
                }
                else if ((M >= 3.0) && (M <= 6.0)) {
                    System.out.println("EXAME");
                }
                else if (M < 3.0) {
                    System.out.println("RETIDO");
                }
            break;
            case 22:
/*              Receba 2 valores inteiros e diferentes. Mostre seus 
                valores em ordem crescente.
 */             int X22, Y22;
                X22 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
                Y22 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
                if (X22 == Y22) {
                    System.out.println("Erro, numeros iguais2");
                    break;
                }
                else if (X22 > Y22) {
                    System.out.println(+Y22+", "+X22);
                }
                else {
                    System.out.println(+X22+", "+Y22);
                }
            break;
            case 23:
/*              Receba 3 valores obrigatoriamente em ordem crescente e um
 *              4º valor não necessariamente em ordem. Mostre os 4 números 
 *              em ordem crescente
 */             double V1, V2, V3, V4;
                V1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1"));
                V2 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 2"));
                if (V1 < V2) {
                    V3 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 3"));
                    if (V2 < V3) {
                        V4 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 4"));
                        if (V4 >= V3) {
                            System.out.println(+V1+", "+V2+", "+V3+", "+V4);
                        }
                        else if (V4 <= V3 && V4 >= V2) {
                            System.out.println(+V1+", "+V2+", "+V4+", "+V3);
                        }
                        else if (V4 <= V2 && V4 >= V1) {
                            System.out.println(+V1+", "+V4+", "+V2+", "+V3);
                        }
                        else if (V4 <= V1) {
                            System.out.println(+V4+", "+V1+", "+V2+", "+V3);
                        }
                    }
                    else {
                        System.out.println("Valor menor do que o esperado");
                    }
                }
                else {
                    System.out.println("Valor menor do que o esperado");
                }
            break;
            case 24:
/*              Receba um valor inteiro. Verifique e mostre se é 
 *              divisível por 2 e 3.
 */             int D24;
                D24 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro"));
                if (D24%2 == 0 && D24%3 == 0) {
                    System.out.println(D24+" E divisivel por 2 e por 3");
                }
                else if (D24%2 == 0) {
                    System.out.println(D24+" E divisivel por 2");
                }
                else if (D24%3 == 0) {
                    System.out.println(D24+" E divisivel por 3");
                }
                else {
                    System.out.println(D24+" Nao e divisivel por 2 e nem por 3");
                }
            break;
            case 25:
/*              Receba a hora de início e de final de um jogo (HH,MM) 
 *              sabendo que o tempo máximo é de 24 horas e pode começar 
 *              num dia e terminar noutro.
 */             int HI, MI, HF, MF, HD, MD;
                HI = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de inicio do jogo"));
                MI = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de inicio do jogo"));
                if (HI > 24 || MI > 59 || HI < 0 || MI < 0) {
                    System.out.println("Erro, hora inicial invalida");
                    break;
                }
                HF = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de final do jogo"));
                MF = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de final do jogo"));
                if (HF > 24 || MF > 59 || HF < 0 || MF < 0) {
                    System.out.println("Erro, hora final invalido");
                    break;
                } 
                if (HF >= HI) {
                    HD = (HF - HI);
                }
                else {
                    HD = (int) ((HF - HI)+24);
                }
                if (MF >= MI) {
                    MD = (MF - MI);
                }
                else {
                    MD = (int) ((MF - MI) + 60);
                    HD --;
                }
                if (HD <24 && MD >=0) {
                    System.out.println("O tempo de duracao do jogo foi de: "+HD+"h:"+MD+"m");
                }
                else {
                    System.out.println("O jogo durou mais de 24 horas");
                }
            break;
            case 26:
/*              Receba 2 números inteiros. Verifique e mostre se o maior
 *              número é múltiplo do menor.
 */             int X26, Y26;
                X26 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
                Y26 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
                if (X26 >= Y26) {
                    if (X26%Y26 == 0) {
                        System.out.println(X26+" e multiplo de "+Y26);
                    }
                    else {
                    System.out.println(X26+" nao e multiplo de "+Y26);
                    }
                }
                else {
                    if (Y26%X26 == 0) {
                        System.out.println(Y26+" e multiplo de "+X26);
                    }
                    else {
                    System.out.println(Y26+" nao e multiplo de "+X26);
                    }
                }
            break;
            case 27:
/*              Receba o número de voltas, a extensão do circuito (em metros)
 *              e o tempo de duração (minutos). Calcule e mostre a velocidade
 *              média em km/h.
 */             int NV;
                double CM, TM, VM;
                NV = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de voltas"));
                CM = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensao do circuito em metros"));
                TM = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duracao em minutos"));
                CM /= 1000;
                TM /= 60;
                CM *= NV;
                VM = (CM/TM);
                System.out.println("A velocidade media em km/h e de "+VM);
            break;
            case 28:
/*              Receba o preço atual e a média mensal de um produto. 
 *              Calcule e mostre o novo preço sabendo que:
 *              Venda Mensal     Preço Atual     Preço Novo
 *               < 500            < 30           + 10%
 *              >= 500 e < 1000  >= 30 e < 80    + 15%
 *              >= 1000          >= 80           - 05%
 *              Obs.: para outras condições, preço novo será igual ao preço atual.
 */             double PA, MP, NP;
                PA = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco atual de um produto"));
                MP = Double.parseDouble(JOptionPane.showInputDialog("Insira a media mensal de um produto"));
                if (MP < 500 && PA < 30) {
                    NP = (PA * 1.10);
                }
                else if (MP >= 500 && MP < 1000 && PA >= 30 && PA <80) {
                    NP = (PA * 1.15);
                }
                else if (MP >= 1000 && PA >= 80) {
                    NP = (PA * 0.95);
                }
                else {
                    NP = PA;
                }
                System.out.println("O novo preco e de "+NP);
            break;
            case 29:
/*              Receba o tipo de investimento (1 = poupança e 2 = renda fixa)
 *              e o valor do investimento. Calcule e mostre o valor corrigido
 *              em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
 *              Demais tipos não serão considerados.
 */             int T;
                double VI, VC;
                T = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento"));
                VI = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
                if (T == 1) {
                    VC = (VI * 1.03);
                    System.out.println("O valor corrigido e de "+VC);
                }
                else if (T == 2) {
                    VC = (VI * 1.05);
                    System.out.println("O valor corrigido e de "+VC);
                }
                else {
                    System.out.println("Tipo incompativel");
                }
            break;
        }
    }
}