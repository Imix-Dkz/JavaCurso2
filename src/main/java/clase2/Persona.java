package clase2;
import java.time.YearMonth;

public class Persona {
	public int edad;
	public String colorPiel;
	public String colorPelo;
	public String colorOjos;
	public String nombre;
	//[Nota]: No es correcto acceder a a metodos PUBLICOS
	//		Lo correcto es encapsular los datos
	
	//public void muestraDatos(int edad, String colorPiel, String colorPelo, String colorOjos){
	public void muestraDatos(Persona varP){
		/*System.out.println(
				"{Edad:"+edad+
				", colorPiel:"+colorPiel+
				", colorPelo:+"+colorPelo+
				", colorOjos:"+colorOjos+"}"
		);*/
		System.out.println(
				"{Nombre:"+varP.nombre+", Edad:"+varP.edad+
				", colorPiel:"+varP.colorPiel+
				", colorPelo:"+varP.colorPelo+
				", colorOjos:"+varP.colorOjos+"}"
		);
	}
	
	public int anioNacimiento(int edad){
		
		int anioNacimiento;
		int actualYear = YearMonth.now().getYear(); //Obtiene el año del sistema
		anioNacimiento = actualYear - edad;
		
		return 	anioNacimiento;
	}


}
