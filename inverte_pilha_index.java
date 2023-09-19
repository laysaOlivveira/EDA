/**
 * Implemente um programa que, dada uma pilha como entrada, inverte os valores dessa pilha até um determinado índice
 * também lido da entrada. Considere que o topo está no índice 0, o elemento abaixo dele no índice 1 e assim por diante.
 * Restrições: Na manipulação da pilha, você só pode utilizar as operações peek, pop, push e isEmpty. É permitido 
 * utilizar estruturas auxiliares.
 * Entrada: Seu programa deve ler da entrada i) o tamanho a pilha; ii) uma sequência de números a serem adicionados
 * (push) nessa pilha (a sequência nunca é maior que o tamanho da pilha) e iii) o índice até onde a inversão deve ser feita.
 * Você pode assumir que o índice passado é válido.
 * Saída: Seu programa deve imprimir um traço (-) e depois a pilha invertida (do topo até o índice passado).
 */


import java.util.Scanner;
import java.util.Stack;

public class inverte_pilha_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // le tamanho da pilha
        int tamanho = sc.nextInt();
        sc.nextLine();
        // lê os elementos da pilha
        String[] elementosPilha = sc.nextLine().split(" ");
        //indice até onde a inversao deve ser feita
        int indice = sc.nextInt();

        // cria pilha para armazenar elementos
        Stack<Integer> stack = new Stack<>();

        // Inicia um loop para preencher a pilha com elementos até o índice especificado.
        for (String elemento : elementosPilha) {
            //Converte o elemento de elementosPilha[i] em um número inteiro
            stack.push(Integer.parseInt(elemento));
        }

        //cria pilha temporaria
        Stack<Integer> tempStack = new Stack<>();
        for(int i = 0; i <= indice; i++){
            //desempilhando os elementos de stack e ordenando em temp até o indice indicado
            tempStack.push(stack.pop());
        }

        System.out.println("-");
        //imprime pilha invertida
        while(!tempStack.isEmpty()){
            System.out.println(tempStack.pop());
        }

        //imprime o restante da pilha original
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        sc.close();
    }
}
