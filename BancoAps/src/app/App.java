/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controls.entity.Banco;
import controls.entity.ContaCorrente;
import telas.TelaBanco;

/**
 *
 * @author 2017102465
 */
public class App {
    private static Banco banco = new Banco();

    public static Banco getBanco() {
        return banco;
    }
    
    
    
    public static void main(String[] a){
        banco.inserir(new ContaCorrente(2017, 500, 5));
        TelaBanco tela = new TelaBanco();
        tela.setEnabled(true);
        tela.setVisible(true);
        tela.toFront();
        
    }
    
}
