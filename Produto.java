/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author Thiago
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantia(int quantidade){
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void adicionarEstoque(int valor){
        this.quantidade += valor;
    }
    public void vender(int valor2)
    {
        if(valor2 > this.quantidade){
            System.out.println("Estoque insuficiente!");
        }
        else{
        this.quantidade -= valor2;
        }
    }
    public void exibirInfo() {
    System.out.printf("Nome: %s | , Preço: R$ %.2f | , Quantidade: %d\n", nome, preco, quantidade);
    
}

}
