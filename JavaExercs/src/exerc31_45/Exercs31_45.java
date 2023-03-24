package exerc31_45;

/*
 *  NOME            : EXERCÍCIOS 31 A 45
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 */
import javax.swing.JOptionPane;

public class Exercs31_45 {

    public static void main(String[] args) {
        int EXERCICIO;
        EXERCICIO = Integer.parseInt(JOptionPane.showInputDialog("Insira qual exercicio devera ser executado"));
        switch (EXERCICIO) {
            case 31:
                Exercicio31();
                break;
            case 32:
                Exercicio32();
                break;
            case 33:
                Exercicio33();
                break;
            case 34:
                Exercicio34();
                break;
            case 35:
                Exercicio35();
                break;
            case 36:
                Exercicio36();
                break;
            case 37:
                Exercicio37();
                break;
            case 38:
                Exercicio38();
                break;
            case 39:
                Exercicio39();
                break;
            case 40:
                Exercicio40();
                break;
            case 41:
                Exercicio41();
                break;
            case 42:
                Exercicio42();
                break;
            case 43:
                Exercicio43();
                break;
            case 44:
                Exercicio44();
                break;
            case 45:
                Exercicio45();
                break;
            default:
                System.out.print("Exercicio Invalido");
                break;
        }
    }
//  31 - Calcule e mostre o quadrado dos números entre 10 e 150.

    public static void Exercicio31() {
        int num, quad;

        System.out.println("*****ESTRUTURA WHILE*****");
        num = 10;
        while (num >= 10 && num <= 150) {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
            num++;
        }

        System.out.println("*****ESTRUTURA DO WHILE*****");
        num = 10;
        do {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
            num++;
        } while (num >= 10 && num <= 150);

        System.out.println("*****ESTRUTURA FOR*****");
        for (num = 10; num >= 10 && num <= 150; num++) {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
        }
    }
//  32 - Receba um número inteiro. Calcule e mostre o seu fatorial.

    public static void Exercicio32() {
        int num, fat, aux;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero a ser fatorado"));
        aux = num;
        fat = 1;
        System.out.println("*****ESTRUTURA WHILE*****");
        while (num > 1) {
            fat *= num;
            num--;
        }
        System.out.println("O fatorial de " + aux + " e " + fat);

        System.out.println("*****ESTRUTURA DO WHILE*****");
        num = aux;
        fat = 1;
        do {
            fat *= num;
            num--;
        } while (num > 1);
        System.out.println("O fatorial de " + aux + " e " + fat);

        System.out.println("*****ESTRUTURA FOR*****");
        fat = 1;
        for (num = aux; num > 1; num--) {
            fat *= num;
        }
        System.out.println("O fatorial de " + aux + " e " + fat);
    }
//  33 - Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.

    public static void Exercicio33() {
        int num;
        double count, serie;
        serie = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para calcular a serie"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (count = 1; count <= num; count++) {
            serie = (serie + (1 / count));
        }
        System.out.println("A serie de " + num + " e: " + serie);
    }
//  34 - Receba um número. Calcule e mostre os resultados da tabuada 
//       desse número.

    public static void Exercicio34() {
        int num, i;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para ser feita a tabuada"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
//  35 - Receba 2 números inteiros, verifique qual o maior entre eles. 
//       Calcule e mostre o resultado da somatória dos números ímpares 
//       entre esses valores.

    public static void Exercicio35() {
        int X, Y, S;
        S = 0;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        if (X > Y) {
            for (Y += 1; Y <= (X - 1); Y++) {
                if (Y % 2 != 0) {
                    S += Y;
                }
            }
            System.out.println("A somatoria dos numeros impares entre X e Y e de: " + S);
        } else if (Y > X) {
            for (X += 1; X <= (Y - 1); X++) {
                if (X % 2 != 0) {
                    S += X;
                }
            }
            System.out.println("A somatoria dos numeros impares entre X e Y e de: " + S);
        } else {
            System.out.println("Numeros inseridos sao iguais");
        }
    }
//  36 - Receba um número N. Calcule e mostre a série 1 + 1/1! + 
//       1/2! + ... + 1/N!

    public static void Exercicio36() {
        int num;
        double i, fat, s;
        s = 0;
        fat = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= num; i++) {
            fat *= i;
            s += (1 / fat);
        }
        System.out.println("A somatoria e de: " + s);
    }
//  37 - Receba um número inteiro. Calcule e mostre a série de
//       Fibonacci até o seu N’nésimo termo.

    public static void Exercicio37() {
        int num, x, y, z, i;
        x = -1;
        y = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de numeros na sequencia de Fibonacci"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= num; i++) {
            z = x + y;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }
//  38 - Receba 100 números inteiros reais. Verifique e mostre o maior 
//       e o menos valor. Obs.: somente valores positivos.

    public static void Exercicio38() {
        double maior, menor, num, i;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
            maior = num;
            menor = num;
        } while (num < 0);
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i < 100; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
            if (num < 0) {
                System.out.println("Numero invalido");
                i--;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior numero foi: " + maior + " e o menor: " + menor);
    }
//  39 - Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
//       Casa : 1 2 3 4 ... 64
//       Qte  : 1 2 4 8 ... N

    public static void Exercicio39() {
        double casa, qte = 1;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (casa = 1; casa <= 64; casa++) {
            System.out.println("Casa: " + casa + " Quantidade: " + qte);
            qte *= 2;
        }
    }
//  40 - Receba 2 números inteiros. Verifique e mostre todos os números primos
//       existentes entre eles.

    public static void Exercicio40() {
        int x, y, maior = 0, menor = 0, i, c, primo;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
            if (x > y) {
                maior = x;
                menor = y;
            } else if (y > x) {
                maior = y;
                menor = x;
            }
        } while (x == y);
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (c = (menor + 1); c <= (maior - 1); c++) {
            primo = 0;
            for (i = 1; i <= c; i++) {
                if (c % i == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.print(c + ", ");
            }
        }

    }
//  41 - Mostre todas as possibilidades de 2 dados de forma que a soma
//       tenha como resultado 7.

    public static void Exercicio41() {
        int d1, d2, i;
        d1 = 1;
        d2 = 6;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 6; i++) {
            if (d1 + d2 == 7) {
                System.out.println(d1 + " + " + d2 + " = 7");
            }
            d1 += 1;
            d2 -= 1;
        }
    }
//  42 - Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99

    public static void Exercicio42() {
        double i, num = 1, den = 1, som = 0;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 50; i++) {
            som += (num / den);
            num += 1;
            den += 2;
        }
        System.out.println("O valor da serie e de: " + som);
    }
//  43 - Calcule e mostre quantos anos serão necessários para que Ana seja
//       maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano
//       e Maria tem 1,5 m e cresce 2 cm ao ano.

    public static void Exercicio43() {
        double a, m, i;
        a = 1.10;
        m = 1.50;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; a < m; i++) {
            a += 0.03;
            m += 0.02;
        }
        System.out.println("Serao necessarios " + i + " anos para Ana passar Maria");
    }
//  44 - Receba o número da base e do expoente. Calcule e mostre o valor da
//       potência.

    public static void Exercicio44() {
        int b, e, p = 1, i;
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do expoente"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= e; i++) {
            p *= b;
        }
        System.out.println(b + " ^ " + e + " = " + p);
    }
//  45 - Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225

    public static void Exercicio45() {
        double i, som = 0, sub = 0, s;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                som += (i / (i * i));
            } else if (i % 2 == 0) {
                sub -= (i / (i * i));
            }
        }
        s = som + sub;
        System.out.println("O resultado da serie e: " + s);
    }
}