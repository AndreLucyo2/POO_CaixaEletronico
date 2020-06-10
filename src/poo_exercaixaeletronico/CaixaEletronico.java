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
        numeroSaques += 1;
    }

    public void depositar(double valor)
    {
        //Para manter o sldo inicial:
        if (numeroDepositos == 0)
        {
            quantiaDinheiro = valor;//Primeiro Deposito
            saldo = quantiaDinheiro;//Sado
            numeroDepositos += 1;
        }
        else
        {
            //Saldo:
            saldo += valor;
            numeroDepositos += 1;
        }
    }

    public double consultarSaldo()
    {
        return saldo;
    }

}
