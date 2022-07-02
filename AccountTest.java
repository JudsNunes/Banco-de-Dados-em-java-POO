package BancoObjetosEClasses;
//cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		//cria um objeto Scanner para obter entrada a partir da janela
		Scanner input = new Scanner(System.in);
		
		//realizamos a chamada da classe Account anteriormente criada 
		//cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account();

		//exibe o valor inicial do nome (null)
		System.out.printf("Nome inicial é: %s%n%n",myAccount.getName());
		
		//solicita e lê o nome
		System.out.println("Por favor digite aqui o seu nome: ");
		String theName =input.nextLine(); //lê uma linha de texto
		myAccount.setName(theName);//insere theName em myAccount
		System.out.println();//gera uma saída de uma linha em branco
		
		//exibe o nome armazenado no objeto myAccount
		System.out.printf("O NOME EM myAccount é:%s%n%n",myAccount.getName());
		
		
		
		
	}

}
