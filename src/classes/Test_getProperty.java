package classes;

import java.io.File;

public class Test_getProperty {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));//Separador que o Sistema Operacional Usa
		System.out.println(System.getProperty("java.class.path"));//Path de onde esta a classe que estou usando
		System.out.println(System.getProperty("java.home"));//Path do java
		System.out.println(System.getProperty("java.vendor"));//Fornecedor do java
		System.out.println(System.getProperty("java.vendor.url"));//URCCL do fornecedor do java
		System.out.println(System.getProperty("java.version"));//Versao do java
		System.out.println(System.getProperty("line.separator"));//Sequencia usado pelos Sistemas Operacionais para 
		//Pular linha, nao sei pq nao ta mostrando :(, mas no Windows é "\r\n"
		System.out.println(System.getProperty("os.arch"));//Arquitetura do Sistema Operacional
		System.out.println(System.getProperty("os.name"));//Nome do Sistema Operacional
		System.out.println(System.getProperty("os.version"));//Versao do Sistema Operacional
		System.out.println(System.getProperty("path.separator"));//Separador usado na classe do java
		System.out.println(System.getProperty("user.dir"));//Caminho do package que estou usando
		System.out.println(System.getProperty("user.home"));//Caminho do user
		System.out.println(System.getProperty("user.name"));//Nome do user
		
		//Test 1
		
		System.out.println("\n\n\n\nTest1");
		//Posso fazer isso, para criar algo na Desktop
		File diretorio = new File(System.getProperty("user.home") + "\\Desktop\\Pasta Loka");
		System.out.println("Pasta Criada? " + diretorio.mkdir());
	}
}