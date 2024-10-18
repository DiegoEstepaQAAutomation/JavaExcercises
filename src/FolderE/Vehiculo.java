package FolderE;

public class Vehiculo 
{
	
	//Propiedades de la clase
	private String marca;
	private String modelo;
	private float precio;
	
	//Constructor de clase vehiculo 
	public Vehiculo(String marca, String modelo, float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	//Getter de precio
	public float getPrecio() {
		return precio;
	}
	
	//Metodo para mostrar informacion
	public String MostrarDatos()
	{
		
		
		return "\nMarca:"+marca+"\nModel:"+modelo+"\nPrecio: $"+precio+"\n";
		 
	}
	
	
	
	
}
