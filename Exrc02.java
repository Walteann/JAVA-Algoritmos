/*
1. Digite um valor e confira se ele é maior do que 5.Se sim mostrar 
mensagem "O número digitado é maior do que 5", senão mostrar 
mensagem "O número digitado é menor do que 5". 
 */
package practicingjava;
import java.util.Scanner;

public class Exrc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor");
        int valor = ler.nextInt();
            if(valor > 5 ){
                System.out.println("O número digitado é maior do que o 5");
            }else{
                System.out.println("o número digitado é menor do que o 5");
            }
        
    }
}
