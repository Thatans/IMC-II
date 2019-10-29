/**
 * 
 */
package br.com.main;

import java.util.Scanner;

/**
 * @author etecja
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double peso;
		double altura;
		double end;
		
		System.out.println("Qual o seu peso? ");
		peso = scanner.nextDouble();
		
		System.out.println("Qual é sua altura? ");
		altura = scanner.nextDouble();
		
		Calcular calcular = new Calcular();
		System.out.println("Resultado: " + calcular.calcularIMC(peso, altura));
		end = scanner.nextDouble();
		
		if (end > 20) {
		    System.out.println(“Magro”);
		} else if (end >= 20 && end <= 24) {
		    System.out.println(“Normal”);
		} else if (end >= 25 && end <= 29) {
		    System.out.println(“Acima do peso”);
		} else if (end >= 30 && end <= 34) {
		    System.out.println(“Obeso”);
		} else {
		    System.out.println(“Muito obeso”);
		}
		
		
	}

}
