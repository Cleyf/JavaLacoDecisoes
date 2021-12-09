package LacosDeDecisao;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int N1, N2, N3;
		
		System.out.println("\nDigite o primeiro numero: ");
		N1 =leia.nextInt();
		System.out.println("\nDigite o segundo numero: ");
	    N2 =leia.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		N3 =leia.nextInt();
		
		if (N1 < N2);{
			if (N2 < N3) {
				System.out.println(N1+"-"+N2+"-"+N3);
			}
			else if (N1 < N3) {
				System.out.println(N1+"-"+N3+"-"+N2);
			} else {
				System.out.println(N3+"-"+N1+"-"+N2);
			}
		}
		
		
	}

}
