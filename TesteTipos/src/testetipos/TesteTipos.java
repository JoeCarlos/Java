/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author joseo
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int idade = 30;
    String valor = Integer.toString(idade);
        System.out.println(valor);
     String valor2 = "31";
     int idade2=Integer.parseInt(valor2);
        System.out.println(valor);
      String valor3 = "33.48";
      float idade3 = Float.parseFloat(valor3);
        System.out.format("%.1f \n",idade3);
    }
    
}
