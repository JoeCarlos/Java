/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

/**
 *
 * @author joseo
 */
public abstract class ContaBancaria {
    private long numeroConta;
    private double saldo;
    //private static long contas = [INDEX];
    
    public void ContaBacaria(long numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void sacar (double valor){        
        saldo -= valor;
    }
    public void depositar (double valor){
            saldo += valor;
    }
    
    public long getNumeroConta (){
        return numeroConta;
    }
    public void setNumeroConta (long numeroConta){
        this.numeroConta =numeroConta;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    

}
