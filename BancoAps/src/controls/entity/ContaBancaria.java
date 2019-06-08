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
    
    	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
    

}
