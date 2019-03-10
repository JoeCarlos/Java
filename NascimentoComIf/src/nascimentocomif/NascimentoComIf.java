/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nascimentocomif;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author joseo
 */
public class NascimentoComIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int idade = anoAtual-nasc;
        System.out.println("Sua idade é: "+idade);
        if (idade>=18)
            System.out.println("Você é maior de Idade");
        else 
            System.out.println("Você é menor de Idade");
    }
    
}
