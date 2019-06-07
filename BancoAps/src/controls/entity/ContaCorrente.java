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
public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperacao;

    public ContaCorrente(long numeroConta, double saldo, double taxaDeOperacao) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    
    }
    public ContaCorrente(Long numeroConta, Double saldo) {
        super(numeroConta, saldo);
    }
    
    public ContaCorrente(long numeroConta) {
        super(numeroConta);
    }

    public ContaCorrente(Double taxaDeOperacao) {
        super();
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    

    public double getTaxaDeOperacao(){
        return taxaDeOperacao;
    }
    
    public void setTaxaDeOperacao (double taxaDeOperacao){
        this.taxaDeOperacao = taxaDeOperacao;
    }
            
    @Override
    public void sacar (double valor){
        if (this.getSaldo() < valor) {
            JOptionPane.showMessageDialog(null, "Saldo abaixo do valor sacável", "SALDO ABAIXO",
            JOptionPane.PLAIN_MESSAGE);
        }
        else {
            this.setSaldo((this.getSaldo() - valor ) - this.taxaDeOperacao);
            JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!", JOptionPane.PLAIN_MESSAGE);

        }
    }
    
    @Override
    public void depositar (double valor){
        this.setSaldo((this.getSaldo() + valor) - this.taxaDeOperacao);
        JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!", "SUCESSO!", JOptionPane.PLAIN_MESSAGE);

    }
    
    @Override
    public String mostrarDados (){
        return "Conta corrente número " + this.getNumeroConta() + "\nSaldo atual: " + this.getSaldo()
                + "\nTaxa atual: " + this.taxaDeOperacao ;
    }
}
