/*
5. Escreva um algoritmo para ler uma temperatura em graus Celsius, 
calcular e escreva o valor correspondente em graus Fahrenhet. 
Para teste utilize o valor 100ºC o valor em Fahrenhet é: 212. 
 */
package practicingjava;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenhet;
        System.out.println("inform tempereture in grau celsius");
        celsius = input.nextDouble();
        fahrenhet = (9 * celsius + 160) / 5;
        System.out.println(celsius + "º equivalent to " + fahrenhet);

    }
}
