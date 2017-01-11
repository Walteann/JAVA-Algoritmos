/*
4. Escreva um algoritmo para ler o salário mensal atual de um funcionário e 
o percentual de reajuste. Calcular e escrever o valor do novo salário.
 */
package practicingjava;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary, reset, newReset;
        System.out.println("report salary");
        salary = input.nextDouble();
        System.out.println("Salary readjustment report");
        reset = input.nextDouble();

        newReset = ((salary * reset) / 100) + salary;

        System.out.println(" New Salary is :" + newReset);

    }
}
