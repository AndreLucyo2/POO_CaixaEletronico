/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_exercaixaeletronico;

/**
 *
 * @author Andre
 */
public class CaixaEletronico
{

    double quantiaDinheiro;//inicial
    double saldo;
    int numeroSaques;
    int numeroDepositos;

    public void sacar(double valor)
    {
        saldo -= valor;
    }

    public void depositar(double valor)
    {
        //Para manter o sldo inicial:
        if(numeroDepositos == 0)
        {
           quantiaDinheiro = valor;//Primeiro Deposito
           saldo = quantiaDinheiro;//Sado
        }
        else
        {
            //Saldo:
            saldo += valor;
        }
        
    }

    public double consultarSaldo()
    {
        return saldo;
    }

}
