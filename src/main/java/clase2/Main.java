package clase2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int opcion, edad;
		String strValue = "";
		Persona personaVar = new Persona();
		Scanner in = new Scanner(System.in);
		
		while(true) {
			//Aqui se creará un menú de acciones...
			System.out.println("Selacciona una accion:"
					+ "\n 1.- Ingresar/Corregir Datos"
					+ "\n 2.- Mostrar Datos Ingresados"
					+ "\n 3.- Calcular año de nacimiento"
					+ "\n 4.- Salir");
			opcion = in.nextInt();
			in.nextLine();
			
			switch (opcion){
				case 1: //Se Piden Datos
					System.out.println("Escriba su nombre:");
					strValue = in.nextLine();
					personaVar.nombre = strValue;
					
					System.out.println("Escriba el color de Piel:");
					strValue = in.nextLine();
					personaVar.colorPiel = strValue;
					
					System.out.println("Escriba el color de Pelo:");
					strValue = in.nextLine();
					personaVar.colorPelo = strValue;
					
					System.out.println("Escriba el color de ojos:");
					strValue = in.nextLine();
					personaVar.colorOjos = strValue;
					
					System.out.println("Escriba su edad(nuemro):");
					edad = in.nextInt();
					personaVar.edad = edad;
					break;
				case 2: //Se Muestra Información
					//personaVar.muestraDatos(persona.edad, personaVar.colorPiel, personaVar.colorPelo,  personaVar.colorOjos);
					personaVar.muestraDatos(personaVar);
					break;
				case 3: //Se aplica calculo de nacimiento
					int Res = personaVar.anioNacimiento(personaVar.edad);
					System.out.println("El año de nacimiento de "+personaVar.nombre+" es:"+Res);
				case 4: System.out.println("Terminando Programa...");
				break;
				default: System.out.println("Opción Incorrecta, seleccione nuevamente");
		    	break;
		    }
			if(opcion==4){
				in.close();
				System.exit(0);
			}			
		}
	}

}
