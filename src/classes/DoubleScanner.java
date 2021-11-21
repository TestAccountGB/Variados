package classes;

import java.util.Locale;
import java.util.Scanner;

public class DoubleScanner {
	public static void main(String[] args) {
		
		Locale brazil = new Locale("pt", "br");
		
		//A seperacao do double do Scanner e baseada no locale
		
		Scanner scan = new Scanner(System.in);
		
		//Mudamos o locale, com o metodo useLocale
		scan.useLocale(brazil);
		double valor;
		
		System.out.println("Digite um numero decimal separando com virgula");
		valor = scan.nextDouble();
		
		System.out.printf(brazil, "Valor: %.2f%n", valor);
		
		scan.useLocale(Locale.US);
		System.out.println("Digite um numero decimal separando com ponto");
		valor = scan.nextDouble();
		scan.close();
		
		System.out.printf(Locale.US, "Valor: %.2f%n", valor);
		
		scan.close();
	}
}
