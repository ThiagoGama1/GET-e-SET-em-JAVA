/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loja;
import java.util.Scanner;
/**
 *
 * @author Thiago
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto a = new Produto();
        Scanner b;
        b = new Scanner(System.in);
        
        
        System.out.println("Informe o nome do produto: ");
        String nome = b.nextLine();
        a.setNome(nome);
        
        
        System.out.println("Informe o preço do produto: ");
        double preco = b.nextDouble();
        a.setPreco(preco);
        
        
        System.out.println("Informe a quantidade do produto: ");
        int quantidade = b.nextInt();
        int resposta;
        a.setQuantia(quantidade);
       do{ 
        System.out.println("Digite 1 para exibir as informações do produto, ou 2 para aumentar a quantidade do produto, ou 3 para vender unidades desse produto, ou 0 para sair: ");
        resposta = b.nextInt();
        switch(resposta){
            case 1: a.exibirInfo();
            break;
            
            case 2: System.out.println("Quantas unidades serão adicionadas ao estoque?");
            int valor = b.nextInt();
            a.adicionarEstoque(valor);
            break;
            
            case 3: System.out.println("Quantas unidades serão vendidas do estoque?");
                    int valor2 = b.nextInt();
                    a.vender(valor2);
                    break;
                    
            case 0: System.out.println("Saindo...");
            break;
            
            default: System.out.println("Valor inválido!");
            break;
        }
       }while(resposta != 0);
    }
    
}
