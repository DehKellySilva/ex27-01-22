package exercicioJava;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,maior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		num3 = leia.nextInt();
		
		if(num1> num2 && num1>num3)
		{
			maior=num1;
		}
		else if(num2> num1 && num2>num3)
		{
			maior=num2;
		}
		else
		{
			maior=num3;
		}
		System.out.println("O maior número: "+maior);
	}
	
	

}
