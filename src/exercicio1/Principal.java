package exercicio1;

import java.util.Locale;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			

			Account conta;

			Locale.setDefault(Locale.US);

			

			System.out.print("Enter account number:");

			int number = sc.nextInt();

			System.out.print("Enter account holder:");

			sc.nextLine();

			String holder = sc.nextLine();

			System.out.print("Is there na initial deposit? (y/n)");

			char resposta = sc.next().charAt(0);

			if (resposta == 'y'){ //chama primeiro construtor		se sim, informa tres respostas

				System.out.println("Enter initial deposit value:");

				double inidep = sc.nextDouble();

				conta = new Account(number, holder, inidep); 

			}

			else {//chama o segundo construtor, que só recebe dois valores pra quem já tem conta

				conta = new Account(number, holder);

			} 



			System.out.println();

			System.out.println("Acount data");

			System.out.println(conta);



			System.out.println();

			System.out.print("Enter a deposit value:");

			double deposit2 = sc.nextDouble();

			conta.deposit(deposit2);	//parte não entendida

			System.out.println("Update data:");

			System.out.println(conta);

			

			System.out.println();

			System.out.print("Enter a withdraw value:");

			double saque = sc.nextDouble();

			conta.withdraw(saque);	//o que acontece?

			System.out.println("Update data:");

			System.out.println(conta);

			

			sc.close();

		}
}