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
public class ContaPoupanca extends ContaBancaria{
    private double limite;
    
    public void ContaPoupanca(long numeroConta, double saldo, double limite){
        super.ContaBacaria(numeroConta, saldo);
        this.limite=limite;
    }
    
    @Override
      public void sacar (double valor){
                super.sacar(valor);
                if (getSaldo()<0){
                limite-=valor;
                    }
      }
      
            
}
      

