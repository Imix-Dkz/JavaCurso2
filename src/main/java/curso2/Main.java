package curso2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona personaVar = new Persona();
			personaVar.colorPiel = "claro";
			personaVar.colorPelo = "negro";
			personaVar.colorOjos = "cafes";
			personaVar.edad = 34;
			personaVar.nombre = "Pepe";
		
		//personaVar.muestraDatos(persona.edad, personaVar.colorPiel, personaVar.colorPelo,  personaVar.colorOjos);
		personaVar.muestraDatos(personaVar);
		int Res = personaVar.anioNacimiento(personaVar.edad);
		System.out.println("El año de nacimiento de "+personaVar.nombre+" es:"+Res);
	}

}
