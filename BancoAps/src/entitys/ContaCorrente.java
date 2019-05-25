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
public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperacao;
    
    public void ContaCorrente (long numeroConta, double saldo, double taxaDeOperacao){
        super.ContaBacaria(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
            
    @Override
    public void sacar (double valor){
        super.sacar(valor+taxaDeOperacao);   
    }
    
    @Override
    public void depositar (double valor){
           super.depositar(valor-taxaDeOperacao);
    }
    
    @Override
    public void mostrarDados (){
        //
    }
}
