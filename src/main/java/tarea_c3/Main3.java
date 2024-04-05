package tarea_c3;

public class Main3 {
	public static void main(String[] args) {
		
		//Como hay que crear 15 objetos diferentes, probe crear un array de objetos...
		Persona[] personaArray = new Persona[15];
		
		int edadBase = -5; //Se Usará para calcular las demás
		String nombreBase = "Fose_";
		String colorPielBase = "Mulato";
		String colorPeloBase = "Castaño"; 
		String colorOjosBase = "Cafés";
		
		//String strTmp = " ";
		
		for(int i=0; i<15; i++) {
			personaArray[i] = new Persona();
			personaArray[i].setNombre(nombreBase+i);
			personaArray[i].setEdad( edadBase+i );
			personaArray[i].setColorOjos(colorOjosBase+i);
			personaArray[i].setColorPiel(colorPielBase+i);
			personaArray[i].setColorPelo(colorPeloBase+i);
			
			System.out.println(personaArray[i].toString());
		}

	}

}
