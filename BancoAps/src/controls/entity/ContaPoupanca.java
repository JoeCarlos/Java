/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls.entity;

import javax.swing.JOptionPane;

/**
 *
 * @author joseo
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    private double limite;
    
    
    public ContaPoupanca() {
		super();
	}
        
    public ContaPoupanca(long numeroConta, double saldo, double limite){
        super(numeroConta, saldo);
        this.limite=limite;
    }
    
    public ContaPoupanca(long numeroConta, double saldo){
        super(numeroConta, saldo);
    }

    public ContaPoupanca(double limite){
        this.limite=limite;
    }
        
    public ContaPoupanca(long numeroConta) {
        super(numeroConta);
    }
    
 
    public double getLimite (){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
  
    @Override
      public void sacar (double valor){
          	if (this.getSaldo() < valor) {
			if ((this.limite + this.getSaldo()) < valor) {
				JOptionPane.showMessageDialog(null, "Saldo abaixo do valor sacável e do limite disponível",
						"SALDO ABAIXO", JOptionPane.PLAIN_MESSAGE);
			} else {
				this.setSaldo(this.getSaldo() - valor);
				JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
						JOptionPane.PLAIN_MESSAGE);
			}
		} else {
			this.setSaldo(this.getSaldo() - valor);
			JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!",
					JOptionPane.PLAIN_MESSAGE);
		}
      }

    @Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!", JOptionPane.PLAIN_MESSAGE);

	}
    @Override
    public String mostrarDados() {
		return "Conta poupança número " + this.getNumeroConta() + "\nSaldo atual: " + this.getSaldo()							+ "\nLimite disponível: " + this.limite;
	}
      
            
}
      

