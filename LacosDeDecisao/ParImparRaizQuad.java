package LacosDeDecisao;

import java.util.Scanner;

public class ParImparRaizQuad {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		double numraiz, numexp;
		
		System.out.println("Informe um número: ");
		numero = leia.nextInt();
		
		if (numero%2==0){
			System.out.println("\nO numero é par");
			numraiz=Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do numero é: "+numraiz);
		} else {
			System.out.println("\nO numero é impar");
			numexp=Math.pow(numero, 2);
			System.out.println("\nO numero ao quadrado é: "+numexp);
		}
			

	}

}
