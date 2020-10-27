package nativaexec1;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Insira um número: ");
		String num = s.nextLine();
		
		if(VerificaNumero.ehValido(num)) {
			System.out.println(GetNumero.maiorNumeroIrmao(num));			
		} else {
			System.out.println("Por favor, insira um número válido.");			
		}
		
	}

}
