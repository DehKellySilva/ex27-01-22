package exercicioJava;

import java.util.Scanner;

public class exerciciosClassificacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner leia = new Scanner(System.in);
		
		int idade;

		
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nVoc� pertence a classifica��o Infantil");

		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nVoc� pertence a classifica��o Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nVoc� pertence a classifica��o Adulto");
		}
		else 
		{
			System.out.println("\nDesculpe, op��o inv�lida");
		}
		
		
	}

}
