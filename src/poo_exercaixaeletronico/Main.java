/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_exercaixaeletronico;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        CaixaEletronico cxElet = new CaixaEletronico();
        int continuar = 0;

        System.out.print("Iniciando Caixa...\n\n");

        System.out.println("Deposito inicial:");
        cxElet.depositar(entrada.nextDouble());

        do
        {
            System.out.println("O que Deseja Fazer?\n  [1]Deposito\n  [2]Saque\n  [3]Saldo\n  [0]Cancelar ");
            int opcao = entrada.nextInt();

            switch (opcao)
            {
                case 0:
                    System.out.println("Operação Cancelada!");
                    
                    break;

                case 1:
                    System.out.println("Operação Deposito!");
                    System.out.println("Informe valor para deposito!");
                    cxElet.depositar(entrada.nextInt());

                    System.out.println("Saldo Atual: " + cxElet.saldo);

                    break;
                case 2:
                    System.out.println("Operação Saque!");
                    System.out.println("Informe valor para Sacar!");
                    cxElet.sacar(entrada.nextInt());

                    System.out.println("Saldo Atual: " + cxElet.saldo);

                    break;
                case 3:
                    System.out.println("Operação Saldo!");
                    System.out.println("Saldo Atual: " + cxElet.saldo);

                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Gostaria de fazer outra operação?\n  [0]NÃO \n  [1]SIM\n");
            continuar = entrada.nextInt();

        }
        while (continuar == 1);

        System.out.println("Saldo Inicial: " + cxElet.quantiaDinheiro);
        System.out.println("Numero de saques: " + cxElet.numeroSaques);
        System.out.println("Numero de Depositos: " + cxElet.numeroDepositos);
        System.out.println("Saldo Atual: " + cxElet.saldo);

    }

}
