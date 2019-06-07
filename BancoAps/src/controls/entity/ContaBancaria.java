/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls.entity;

/**
 *
 * @author joseo
 */
public abstract class ContaBancaria {
    private long numeroConta;
    private double saldo;

    
    public ContaBancaria(long numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(long numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    	public ContaBancaria() {
		super();
	}
    
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
    
    public void tranferir (double valor, ContaBancaria contaDe, ContaBancaria contaPara){
        
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
