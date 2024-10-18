package FolderE;

import java.util.Scanner;

import JavaExercises.ProgrammingJava;

public class Examples 
{
	
	
	
	//Metodo para encontrar el ID del coche mas barato
	public static int  indiceCocheMBarato(Vehiculo coches [ ]) 
	{
		
		float precio;
		int indice = 0;
		 
		//Llamar a metodo precio 
		 
		precio = coches[0].getPrecio();
		  
		//Ciclo para recorrer coches y preguntar si es mas barato que precio de referencia
		for(int i=1;i<coches.length;i++) 
		{
			if(coches[i].getPrecio() < precio ) 
			{
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		
		//Retorna indice 
		return indice;
		
	}
	//Metodo principal
	public static void main(String[ ] args)
	{
		
		ProgrammingJava programmingjava = new  ProgrammingJava();
		
		programmingjava.impresionx();
		
		programmingjava.leerNombre();
		
		programmingjava.leerEdad();
		
		int EdadUsuario =programmingjava.DevEdad();
		
		if(EdadUsuario>=18) 
		{
			
			 
			System.out.println(programmingjava.DevNombre()+"Es mayor de edad ya que tiene"+programmingjava.DevEdad());
			 		
		}
		else 
		{
			
			System.out.println(programmingjava.DevNombre()+"Es menor de edad ya que tiene"+programmingjava.DevEdad());
			
		}
		
		//Metodo para ingresar informacion
		Scanner entrada = new Scanner(System.in);
		//Variables necesarias
		String marca,modelo = null ;
		float precio;
		int numeroVehiculos,indiceBarato;
		
		System.out.print("Digite la cantidad de vehiculos: ");
		
		//Ingresa cantidad de vehiculos
		numeroVehiculos = entrada.nextInt();
		
		//Objeto vehiculos con propiedades en arreglo
		Vehiculo coches[ ] = new Vehiculo[numeroVehiculos]; 
		
		//Ciclo de ingreso de datos en tabla o lista de coches
		
		for(int i=0;i<coches.length;i++) 
		{
			//Linea de separacion 
			entrada.nextLine();
			System.out.println("Digite las caracteristicas del coche"+(i+1)+":");
			//Ciclo de ingreso de datos en tabla o lista de coches
			System.out.print("Introduzca Marca: ");
			
			marca = entrada.nextLine();
			//Ciclo de ingreso de datos en tabla o lista de coches
			System.out.print("Introduzca Modelo: ");
			
			modelo = entrada.nextLine();
			
			//Ciclo de ingreso de datos en tabla o lista de coches
			System.out.print("Introduzca Precio: ");
			
			precio = entrada.nextFloat();
			//Instancia de coches 
			coches[i] = new Vehiculo(marca, modelo, precio);
			
			
			
			
			
		}
		
		//Almacenar resultado de metodo Coche mas barato en variable
		indiceBarato =  indiceCocheMBarato(coches);
		
		System.out.print("El coche mas barato es:"+coches[indiceBarato].MostrarDatos());
		
		
		
	}
}
