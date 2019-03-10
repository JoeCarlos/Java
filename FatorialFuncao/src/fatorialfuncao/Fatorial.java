/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialfuncao;

/**
 *
 * @author joseo
 */
public class Fatorial {
    private int numero=0;
    private int fatorial=1;
    private String formula="";

    public void setValor (int n){
        numero = n;
        int fat=1;
        String s="";
        for (int c=numero;c>1;c--){
            fat*=c;
        s+=c+" x ";
        }
        s+="1 = ";
        fatorial=fat;
        formula = s;
    }
     public int getFatorial (){
        return fatorial;
    }
     public String getFormula(){
        return formula;
    }
}
