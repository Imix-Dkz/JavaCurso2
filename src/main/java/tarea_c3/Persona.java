package tarea_c3;
import java.time.YearMonth;


public class Persona {
	//Clase Persona Privada, ENCAPSULACIÓN
	private int edad;
	private String colorPiel;
	private String colorPelo;
	private String colorOjos;
	private String nombre;
	
	//Getters+Setters
	public int getEdad() { return edad; }
	public void setEdad(int edadd) {
		//System.out.println("Edadd:"+edadd);
		//Primero se valida que la edad no sea un número negativo
		if(edadd<0){
			this.edad = 0; 
		}else{ this.edad = edadd*2; }
	}
	public String getColorPiel() { return colorPiel; }
	public void setColorPiel(String colorPiel) { this.colorPiel = colorPiel; }
	public String getColorPelo() { return colorPelo; }
	public void setColorPelo(String colorPelo) { this.colorPelo = colorPelo; }
	public String getColorOjos() { return colorOjos; }
	public void setColorOjos(String colorOjos) { this.colorOjos = colorOjos; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@Override
	public String toString() {
		return nombre+":[edad="+edad+", NacioEn="+anioNacimiento(edad)
				+", colorPiel="+colorPiel
				+", colorPelo="+colorPelo
				+", colorOjos="+colorOjos+"]";
	}
	
	public int anioNacimiento(int edad){	
		int anioNacimiento;
		int actualYear = YearMonth.now().getYear(); //Obtiene el año del sistema
		anioNacimiento = actualYear - edad;
		
		return 	anioNacimiento;
	}

}
