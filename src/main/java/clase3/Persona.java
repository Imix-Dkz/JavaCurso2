package clase3;
//import curso2.Persona;

public class Persona {
	//Clase Persona Privada, ENCAPSULACIÓN
	private int edad;
	private String colorPiel;
	private String colorPelo;
	private String colorOjos;
	private String nombre;
	
	//Setter+Getters
		public void setEdad(int edad) { this.edad = edad; }
		public int getEdad() { return edad; }

		public void setColorPiel(String colorPiel) { this.colorPiel = colorPiel; }
		public String getColorPiel() { return colorPiel; }
		
		public void setColorPelo(String colorPelo) { this.colorPelo = colorPelo; }
		public String getColorPelo() { return colorPelo; }
		
		public void setColorOjos(String colorOjos) { this.colorOjos = colorOjos; }
		public String getColorOjos() { return colorOjos; }
		
		public void setNombre(String nombre) { this.nombre = nombre; }
		public String getNombre() { return nombre; }	
	
	@Override
	public String toString() {
		return "Persona [edad=" + edad 
				+ ", colorPiel=" + colorPiel 
				+ ", colorPelo=" + colorPelo 
				+ ", colorOjos=" + colorOjos 
				+ ", nombre=" + nombre + "]";
	}
	
}
