/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author joseo
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes [] = {"Janeiro", "Fevereiro","Março","Abril","Maio",
       "Junho","Julho","Agosto","Setembro","Outubro","Novembro", "Dezembro"};
       int tot [] = {31, 28, 31,30,31,30,31,31,30,31,30,31};
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        if ((ano%4==0)&&(ano%100!=0)){
            tot[1]=29;
        }
        System.out.println(ano);
       for (int i = 0; i <mes.length;i++){
           System.out.println("O mês de "+ mes[i] + " tem " + tot[i] + 
                   " dias ao todo.");
       }    
}
}
