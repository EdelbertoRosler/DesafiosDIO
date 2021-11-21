package one.digitalinnovation.precos;

import java.util.Scanner;

public class Lanche {

    public static void main(String[] args) {

        final double cachorroQuente = 4.0;
        final double Xsalada = 4.5;
        final double Xbacon = 5.0;
        final double torradaSimples = 2.0;
        final double refrigerante = 1.5;

        int codigo, quant;
        double preco = 0;

        Scanner scan = new Scanner(System.in);
        codigo = scan.nextInt();
        quant = scan.nextInt();

        if (codigo == 1) { preco = (cachorroQuente * quant);}//codigo 1: cachorro quente
            else if (codigo == 2) { preco = (Xsalada * quant); }//codigo 2: Xsalada
            else if (codigo == 3) { preco = (Xbacon * quant); }//codigo 3: Xbacon
            else if (codigo == 4) { preco = (torradaSimples * quant); }//codigo 4: torrada simples
            else if (codigo == 5) { preco = (refrigerante * quant); }//codigo 5: refrigerante

        System.out.printf("Total: R$ %.2f\n", preco);
    }
}
//********************************** Lanche *******************************************
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.


Exemplo de Entrada	    Exemplo de Saída
3 2                     Total: R$ 10.00
4 3                     Total: R$ 6.00
2 3                     Total: R$ 13.50
 */