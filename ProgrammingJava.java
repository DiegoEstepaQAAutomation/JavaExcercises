package JavaExercises;

import java.util.Scanner;

public class ProgrammingJava 
{
	//int i = 0;
	
	//Imprimir x en consola
		public void impresionx() 
		{
			int n = 10;
			
			for(int i =0;i<=n;i++) 
			{
				for(int j=1;j<=n;j++) 
				{
					if(i==j||j+i==11 ) 
					{System.out.print("X");}
					else {System.out.print(" ");}
				}
					
				System.out.println();
			
			}
			
			
			
			
			
		}
		
		
		String Nombre;
		int Edad;
		
		
		Scanner sc = new Scanner(System.in);
		
		public void leerNombre() 
		{
			
			
			Nombre = sc.nextLine();
			
			
		}
		
		public String DevNombre() 
		{
			
			
			return Nombre;
			
		}
		
		public void leerEdad() 
		{
			Edad = sc.nextInt();
		}
		
		
		public int DevEdad() 
		{
			
			return Edad;
			
		}
		

}
