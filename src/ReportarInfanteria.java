/**
 * Clase que define el comportamiento de reportarse para la infanteria.
 * Patron Strategy
 */
public class ReportarInfanteria implements ReportBehaviour{

	@Override
	public String reportar(String id, String name){
		return "El soldado " + name + " con id " + id + " es un Infante?";
	}
}