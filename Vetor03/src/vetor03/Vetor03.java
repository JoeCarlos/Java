/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;



/**
 *
 * @author joseo
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double vetor03 [] = {3.5,7.3,9,-4.4};
    Arrays.sort(vetor03);
    for (double valor: vetor03){
        System.out.print(valor + " ");
        
    }
    System.out.println("");
    int pos = Arrays.binarySearch(vetor03, 9);
        System.out.println("O valor " + 9 + " está na posição " + pos);
    int num []= new int [100];
    Arrays.fill(num, 0);
    for (int valor:num){
        System.out.print(valor + " ");
    }
    
    }
    
}
