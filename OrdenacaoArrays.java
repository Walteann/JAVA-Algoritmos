
public class OrdenacaoArrays {
	public static void main(String[] args) {
		int[] valores = {1,5,9,2,3,4,7}; // elementos do Array
		/* bubbleSort */
		int aux; // variavel auxiliar
		int contador = 1;
		do {
			for(int i = 0; i < valores.length - 1; i++){ // tamanho do array - 1
				if(valores[i] < valores[i + 1]){ // se o valor do indice atual for menor que o valor do proximo indice... 
					aux = valores[i]; // aux recebe o valor do indice atual
					valores[i] = valores[i + 1]; // indice atual recebe o valor do proximo indice
					valores[i+1] = aux; // valor do proximo indice, recebe o aux
				}
			}
			contador++; // incrementa + 1
		}while(contador < valores.length);
		
		
		System.out.println("Arrays em ordem decrescente");
		for(int decrecente : valores) {
			System.out.print(decrecente+" ");
		}
		int aux2;
		int contador2 = 1;
		do {
			for(int i = 0; i < valores.length - 1;i++){
				if(valores[i] > valores[i + 1]){
					aux2 = valores[i];
					valores[i] = valores[i+1];
					valores[i+1] =  aux2;
				}
			}
			contador2++;
		}while(contador2 < valores.length);
		System.out.println("\nArrays em ordem Crescente");
		for(int crecente: valores){
			System.out.print(crecente+" ");
		}
	}
}
