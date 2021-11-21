package classes;

import java.util.Locale;

public class Sysout {
	public static void main(String[] args) {
		
		//Mostrando erro...
		System.err.println("Deu erro kraio");
		
		//O printf aceita locale, e se nao passar nenhum locale, ele vai pegar o locale padrao da jvm (Que depende do idioma
		//Que voce instalou).
		
		double valor = 2.54441;
		
		System.out.printf(new Locale("en", "us"), "%.2f%n", valor);
		//No EUA, eles usam o ponto para separar casas decimais

		//%.2f e para delimitar o tanto de casas decimais, posso trocar pra %.4f para 4 casas decimais.
		//E o %n para falar que no final tem um \n, basicamente eu transformo esse printf, em um "printfln".
		//Porque no println, ele basicamente ta falando que no final vai ter um \n
		
		System.out.printf(new Locale("pt", "br"), "%.2f%n", valor);
		//E no br usamos a virgula
		
		//Locale padrao...
		System.out.println(Locale.getDefault());
		System.out.printf("%.2f%n", valor);
		
		//Mas, ao inves de instanciar um objeto, o Locale deixa a gente apenas puxar o idioma, como mostra abaixo...
		System.out.printf(Locale.US, "%.2f%n", valor);
		//Mas como voce pode ver, desse jeito temos pouca opcao. Nao tem nem o idioma brasileiro :(
		
		//Mas caso voce so vai usar um locale pra todo lugar, como por exemplo o locale do EUA, podemos fazer assim...
		
		System.out.printf("Padrao: %.2f%n", valor);
		Locale.setDefault(Locale.US);
		//Agora todo lugar que usa o Locale default da JVM, vai trocar pra esse
		
		System.out.printf("Padrao: %.2f%n", valor);
		//Agora eu nao preciso ficar instanciando um locale em todo println
		
	}
}
