package classes;

public class Cast {
	public static void main(String[] args) {
		
		int inteiro = 5;
		int inteiro2 = 2;
		double doubleBolado; 
		
		doubleBolado = inteiro/inteiro2;
		System.out.println(doubleBolado);
		
		doubleBolado = (double) inteiro/inteiro2; //Os numeros sao inteiros, mas podemos fazer que o RESULTADO
		//retorne um double
		System.out.println(doubleBolado);
		
	}
}
