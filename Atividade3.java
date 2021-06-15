import java.util.ArrayDeque;
import java.util.ArrayList;

public class Atividade3 { 

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(5);
		ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
		ArrayDeque<Integer> fila = new ArrayDeque<>(10);

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		while(!lista.isEmpty()) {
			int elemento = lista.remove(0);
			pilha.push(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}

		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);

		while(!lista.isEmpty()) {
			int elemento = lista.remove(0);
			pilha.push(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}

		while(!pilha.isEmpty()) {
			int elemento = pilha.pop();
			fila.add(elemento);
			System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);
		}

		System.out.println(fila);
	}
}


//A ordem dos números exibidos é diferente da ordem em que foram inseridos porque na pilha o último a entrar é o
primeiro a sair, “Last In, First Out”, por isso a exibição dos números foi diferente do que foi inserido.

