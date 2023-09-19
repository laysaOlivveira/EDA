/**
 * Escreva um programa que retorne o maior elemento de uma pilha 
 * considerando os valores entre o topo e o índice passado na entrada padrão.
 * Entrada: Seu programa deve ler uma linha da entrada padrão representando os
 * elementos a serem adicionados na pilha (um a um e na ordem em que chegam na entrada padrão) e
 * um índice passado como limite para a busca.
 * Você só pode usar push, pop e outra estrutura auxiliar. A pilha deve manter a sua 
 * configuração inicial após a execução do seu algoritmo.
 * Saída: Seu programa deve imprimir o maior elemento da pilha, considerando os valores entre 
 * o topo (índice 0) e o índice passado na entrada padrão.
 * Restrições: Você só pode usar os métodos padrões da interface de pilha (e. g. peek, push, pop, isEmpty etc)
 * e outra estrutura auxiliar. A pilha deve manter a sua configuração inicial após a execução do seu algoritmo.
 * Se a sua pilha for baseada em arrays, você não pode acessar um índice arbitrário utilizando pilha[index],
 * por exemplo. Todo o acesso deve ser feito através de pop, push e peek.
 */

import java.util.Scanner;
import java.util.Stack;
public class max_pilha_index{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lê os elementos da pilha
        String[] elementosPilha = sc.nextLine().split(" ");
        //le o indice limite da busca
        int index = Integer.parseInt(sc.nextLine());

        // cria pilha para armazenar elementos
        Stack<Integer> stack = new Stack<>();
        //pilha para armazenar o maior
        Stack<Integer> maxStack = new Stack<>();


        // Inicia um loop para preencher a pilha com elementos até o índice especificado.
        for (String elemento: elementosPilha) {
            //Converte o elemento de elementosPilha[i] em um número inteiro
            int valor = Integer.parseInt(elemento);
            //add o valor na pilha
            stack.push(valor);
        }

        // Inicia outro loop para calcular o máximo até o índice especificado.
        for (int i = 0; i <= index; i++) {
            //Aqui, desempilhamos o elemento do topo da pilha original (stack) e o armazenamos na variável 
            int valor = stack.pop();
            // Verifica se a pilha maxStack está vazia ou se o valor é maior ou igual 
            // ao elemento no topo da pilha maxStack. Se for verdadeiro, empurra o valor para maxStack.
            if (maxStack.isEmpty() || valor >= maxStack.peek()) {
                maxStack.push(valor);
            }
        }
        //obtem o maior valor e retorna ele
        int maxElement = maxStack.peek();
        System.out.println(maxElement);
        
        sc.close();
    }
}