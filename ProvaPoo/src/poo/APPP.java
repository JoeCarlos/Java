
package poo;

import java.util.Scanner;

public class APPP {
    
    //Constante
    static final int MAXCONTA = 20;
   
    //variável comum
    static int index = 0;
    
    //Lista de contas
    static Conta[] lista = new Conta[MAXCONTA];
    
    static Scanner tecla = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {                
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("1-Incluir conta");
            System.out.println("2-Sacar");
            System.out.println("3-Depositar");
            System.out.println("4-Listar saldo das Contas");
            System.out.println("5-Tranferência entre Contas");
            System.out.println("6-Sair");
            System.out.println("Digite sua opção: ");
            op = tecla.nextInt(); 
            switch(op){
                case 1: incluirConta(); break;
                case 2: sacarValor(); break;
                case 3: depositarValor(); break;    
                case 4: listarContas(); break;
                case 5: transacao(); break;
                case 6: break;
            }
        } while (op!=6);       
    }
    
    
    public static void incluirConta(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o saldo da conta:");
        double saldo = tecla.nextDouble();
        //Criar o objeto e inserir na lista
        lista[index++] = new Conta(num, saldo);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    public static void sacarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do saque:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].sacar(valor);
                break;
            }
        }
    }
        public static void sacarValor(int numero, double valor1){
        //Entrada
               
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (numero == lista[i].getNumero()){
                lista[i].sacar(valor1);
                break;
            }
        }
    }
    
    public static void depositarValor(){
        //Entrada
        System.out.println("Digite o número da conta:");
        int num = tecla.nextInt();
        System.out.println("Digite o valor do depósito:");
        double valor = tecla.nextDouble();
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].depositar(valor);
                break;
            }
        }
    }
        public static void depositarValor(int num, double valor){
        
        //Procurar a conta na lista
        for (int i = 0; i < lista.length-1; i++) {
            if (num == lista[i].getNumero()){
                lista[i].depositar(valor);
                break;
            }
        }
    }
    
    public static void listarContas(){
        double total = 0;
        System.out.println("Nº Conta:........ SALDO:");
        for (int i = 0; i < lista.length-1; i++) {
            if (lista[i] != null){
                System.out.println(lista[i].getNumero()
                                   + "........" +
                                   lista[i].getSaldo());
                //total += lista[i].getSaldo();
                total = total + lista[i].getSaldo();
            }else{
                break;
            }
        }
        System.out.println("Total:........" + total);
    }
    
    public static void transacao (){
        System.out.println("Digite o número da conta a tranferir: ");
        int num = tecla.nextInt();
        System.out.println("Digite o número da conta a receber: ");
        int num2 = tecla.nextInt();        
        System.out.println("Digite o valor da tranferência: ");
        double valor = tecla.nextDouble();
           sacarValor(num,valor);
           depositarValor(num2, valor);
                
    }
    
    
}
