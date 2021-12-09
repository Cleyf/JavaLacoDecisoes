package LacosDeDecisao;

import java.util.Scanner;

public class IntMaior {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("\nDigite o primeiro numero: ");
		numero1 =leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		numero2 =leia.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		numero3 =leia.nextInt();
		
		if (numero1>numero2 && numero1>numero3) {
			System.out.println("\nO maior numero digitado é: "+numero1);
		}
		else if (numero2>numero1 && numero2>numero3){
			System.out.println("\nO maior numero digitado é: "+numero2);
		}
		else {
			System.out.println("\nO maior numero digitado é: "+numero3);
		}

	}

}
