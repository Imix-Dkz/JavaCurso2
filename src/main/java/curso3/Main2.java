package curso3;
//import curso2.Persona;

public class Main2 {

	public static void main(String[] args) {
		//Se crea variable de clase
		Persona personaVar = new Persona();
			personaVar.setEdad(34);
			personaVar.setColorOjos("Negro");
			personaVar.setColorPelo("Azbache");
			personaVar.setColorPiel("Caguama");
			personaVar.setNombre("Juan");	
		System.out.println(personaVar.toString());
		
		Persona personaVar2 = new Persona();
			personaVar2.setEdad(30);
			personaVar2.setColorOjos("Azules");
			personaVar2.setColorPelo("Rojo");
			personaVar2.setColorPiel("Cartón");
			personaVar2.setNombre("Fose");
		System.out.println(personaVar2.toString());
		
		/*Mostrar el el metodo año de la otra tare para 15 o 30 personas*/
	}

}
