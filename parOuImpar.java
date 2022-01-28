package exercicioJava;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int par=0,num,impar=0;
	
	Scanner leia = new Scanner(System.in);
	
	for(int i=1;i<=10;i++)
	{
		System.out.println("\nEntre com o número "+i+":");
		num = leia.nextInt();
		
		if(num % 2 == 0)
		{ 
			par++;
		}
		if(num % 2 == 1) 
		{
			impar++;
		}
	}
	System.out.println("\nQuantidade: "+par+" números pares");
	System.out.println("\nQuantidade: "+impar+" números ímpares");

	}
	}


