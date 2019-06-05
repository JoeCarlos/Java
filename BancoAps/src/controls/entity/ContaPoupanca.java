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
public class ContaPoupanca extends ContaBancaria{
    private double limite;
    
    
    public ContaPoupanca(long numeroConta, double saldo, double limite){
        super(numeroConta, saldo);
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
                super.sacar(valor);
                if (getSaldo()<0){
                limite-=valor;
                    }
      }
      
            
}
      

