/**
 * Clase que define el comportamiento de reportarse para los caballeros.
 * Patron Strategy
 */

public class ReportarCaballeria implements ReportBehaviour{

	@Override
	public String reportar(Soldado s){
		return "El soldado " + s.getNombre() + " con id " + s.getId() + " es un Caballero.";
	}
}