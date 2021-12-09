package LacosDeDecisao;

import java.util.Scanner;

public class IdadeCategoria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("Pessoa com a idade infantil");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("Pessoa com a idade juvenil");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("Pessoa com a idade adulta");
		} else {
			System.out.println("Fora do intenvalo");
		}

	}

}
