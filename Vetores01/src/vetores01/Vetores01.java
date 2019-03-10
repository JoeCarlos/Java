/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores01;

/**
 *
 * @author joseo
 */
public class Vetores01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor1 [] = new int[10];
        int [] vetor2 = {0,2,4,8,5,6};
        System.out.println("O total de casas de vetor1 é " + vetor1.length);
        for (int c= 0; c<=vetor2.length-1;c++){
            System.out.println("O valor da posição " + c +" é " + vetor2[c]);
        }
    }
    
}
