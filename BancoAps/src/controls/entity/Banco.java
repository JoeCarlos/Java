/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls.entity;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author joseo
 */
public class Banco {
   private List<ContaBancaria> lista = new ArrayList<>();
    
public void inserir (ContaBancaria obj){
    //
          if (lista.contains(obj)) {
            JOptionPane.showMessageDialog(null, "Conta já cadastrada!", "ERRO", JOptionPane.PLAIN_MESSAGE);
        } else {
            lista.add(obj);
            JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!", "SUCESSO", JOptionPane.PLAIN_MESSAGE);

        }
}


    public List<ContaBancaria> getContas() {
        return lista;
    }

    public void remover (ContaBancaria conta){
    for (int i = 0; i<= lista.size();i++){
        ContaBancaria c = lista.get(i);
        if (c.equals(conta)){
            lista.remove(i);
            break;
        }
    }
}        
public ContaBancaria procurar(Long conta){
        ContaBancaria contaBancaria = new ContaCorrente(conta);
        Integer index;

        index = lista.indexOf(contaBancaria);

        if (index != -1) {
            return lista.get(index);
        } else {
            contaBancaria = new ContaPoupanca(conta);
            index = lista.indexOf(contaBancaria);
        }

        if (index != -1) {
            return lista.get(index);
        } else {
            return null;
        }
        
        } 
}
