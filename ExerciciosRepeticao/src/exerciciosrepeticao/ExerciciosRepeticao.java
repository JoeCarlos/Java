/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosrepeticao;
import javax.swing.JOptionPane;
/**
 *
 * @author joseo
 */
public class ExerciciosRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Bem Vindo!", JOptionPane.ERROR_MESSAGE); 
    //JOptionPane.showMessageDialog(null,"Você digitou o número " + numero);
    int numero=0, soma=0, pares=0, impares= 0, cem = 0, tot= 0;
    float media=0;
    do {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Digite um número:<br><em>(Valor 0 interrompe)</em></html>"));
        soma+=numero;
        tot++;
        if (numero % 2 == 0)
            pares++;
        else 
            impares++;
        if (numero>100)
            cem++;
    }while (numero!=0);
    media = soma/tot;
    JOptionPane.showMessageDialog (null, "<html>Resultado Final<hr>" +
            "<br>Total de Valores: " + tot +
            "<br>Total de Pares: " + pares + 
            "<br>Total de Ímpares" + impares +
            "<br>Acima de 100: " + cem +
            "<br>Somatório vale "+ soma + 
            "<br>Média do Valores"+media);
    
 }   
 
    
}
