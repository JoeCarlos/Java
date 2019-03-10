/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author joseo
 */
public class Funcao01 {
    static void soma (int a, int b){
    int s = a + b;
        System.out.println("A soma é: " + s);
    }
    static int soma2 (int a, int b) {
    int s = a + b;
    return s;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa! ");
        soma(3,2); 
        int sum = soma2(2,9);
        System.out.println("Soma2 é " + sum);
    }
    
}
