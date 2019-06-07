/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseo
 */
public class Banco {
    List<ContaBancaria> lista = new ArrayList<>();
    
public void inserir (ContaBancaria conta){
    //
   lista.add(conta);
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
    ContaBancaria c = null;
      for (int i = 0; i<= lista.size();i++){
         
          if (lista.equals(conta.getNumeroConta())){
              c = lista.get(i);
              break;
          }
     
      }
        return c;
        
        } 
}
