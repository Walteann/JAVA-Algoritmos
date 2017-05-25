/**
 * Walteann Costa
 * walteann3@gmail.com
 * 
 *  Muitoo Bom desafio :)
*/
public class Main3 {
	
	
	
	private static final char[] MANDAR_CV_PARA = new char[] {'i', 't', '@', 'r', 'm', 't', 'z', 'c', 'r', '.', 'c', 'a', 'a', 't', 't', 'c', 'b', 'a', 'i', '.', 'o'};
	
	private static final int[][] SWAPS = new int[][] {
		{2, 8, 18, 4, 0, 15, 1, 11, 3, 14, 20, 5, 19, 16, 13, 6, 12, 10, 17, 9, 7},
		{15, 8, 6, 2, 17, 14, 4, 9, 0, 5, 13, 7, 3, 19, 10, 18, 20, 11, 16, 12, 1},
		{0, 17, 20, 7, 6, 3, 14, 2, 18, 15, 19, 8, 16, 1, 5, 9, 13, 12, 11, 4, 10},
		{12, 11, 15, 14, 10, 4, 0, 19, 13, 17, 3, 9, 20, 6, 8, 16, 1, 7, 5, 18, 2}
	};
	
	public static void main(String[] args) {
		
	
		
		boolean trocar;
		
		for( int W = 0 ; W < SWAPS.length ; W++){ 
		trocar =  true;
		while(trocar == true){
			trocar = false;
			
			for(int i = 0; i < 20 ; i++){
				
				if(SWAPS[W][i] > SWAPS[W][i + 1]){
					int aux = SWAPS[W][i];
					SWAPS[W][i] = SWAPS[W][i+1];
					SWAPS[W][i + 1] = aux;
					
					char aux2 = MANDAR_CV_PARA[i];
					MANDAR_CV_PARA[i] = MANDAR_CV_PARA[i+1];
					MANDAR_CV_PARA[i + 1] = aux2;
					
					
					trocar = true;
					
				}
			}
			
		}
		
		} 

		
		for( char email : MANDAR_CV_PARA){
			System.out.print(email);
		}
		
		
	}
}
