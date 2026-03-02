import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> dados = Arrays.asList(5, 3, 6, 2, 10);
		List<Integer> ordenado = ordenacaoPorSelecao(dados);
		System.out.println(ordenado); // [2, 3, 5, 6, 10]

	}
	
	// retorna o índice do menor elemento na lista
	public static int buscaMenor(List<Integer> arr) {
		int menor = arr.get(0);
		int menorIndice = 0;
		
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) < menor) {
				menor = arr.get(i);
				menorIndice = i;
			}
		}
		return menorIndice;
	}
	
	// constrói uma nova lista ordenada, removendo o menor da lista original
	public static List<Integer> ordenacaoPorSelecao(List<Integer> arr) {
		List<Integer> copia = new ArrayList<>(arr); // remove sem alterar a lista original
		List<Integer> novoArr = new ArrayList<>();
		
		int n = copia.size();
		
		for (int i = 0; i < n; i++) {
			int idxMenor = buscaMenor(copia);
			Integer menor = copia.remove(idxMenor);
			novoArr.add(menor);
		}
		return novoArr;
	}

}
