import java.util.Scanner;
import java.util.Stack;

public class inverte_pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // le tamanho da pilha
        int tamanho = sc.nextInt();
        sc.nextLine();

        // lê os elementos da pilha
        String[] elementosPilha = sc.nextLine().split(" ");

        // cria pilha para armazenar elementos
        Stack<Integer> stack = new Stack<>();
        // Inicia um loop para preencher a pilha com elementos até o índice especificado.
        for (String elemento: elementosPilha) {
            //Converte o elemento de elementosPilha[i] em um número inteiro
            //add o valor na pilha
            stack.push(Integer.parseInt(elemento));
        }

        //cria pilha temporaria
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            //desempilhando os elementos de stack e ordenando em temp até o indice indicado
            tempStack.push(stack.pop());
        }

        //imprime pilha invertida
        while(!tempStack.isEmpty()){
            System.out.println(tempStack.pop());
        }

        sc.close();
    }
}
