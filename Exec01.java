/*
1.Escreva um programa em Java que recebe 3 números, calcule e mostre a soma.
 */
package practicingjava;
import java.util.Scanner;

public class Exec01 {

    public static void main(String[] args) {
    
        int num1,num2,num3;
        Scanner ler = new Scanner(System.in);
        
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = ler.nextInt();
        
        System.out.println(num1+num2+num3);
        
    }
    
}
