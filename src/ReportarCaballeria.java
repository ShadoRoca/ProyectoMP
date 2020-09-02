/**
 * Clase que define el comportamiento de reportarse para los caballeros.
 * Patron Strategy
 */

public class ReportarCaballeria implements ReportBehaviour{

	@Override
	public String reportar(String id, String name){
		return "El soldado " + name + " con id " + id + " es un Caballero.";
	}
}