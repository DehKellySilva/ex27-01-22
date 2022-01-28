package exercicioJava;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade=0,jovens=0,idosos=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		while(idade!=99)
		{
			if(idade<21)
				jovens++;
			if(idade>50);
				idosos++;
			{
			System.out.println("\nDigite a idade: (Para sair digite 99)");
			idade = leia.nextInt();
			
			}
		
		}
		System.out.println("\nQuantidade de menores: " +jovens+" de 21 anos");
		System.out.println("\nQuantidade de maiores: " +idosos+" de 50 anos");
	}

}
