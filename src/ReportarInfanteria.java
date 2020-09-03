/**
 * Clase que define el comportamiento de reportarse para la infanteria.
 * Patron Strategy
 */
public class ReportarInfanteria implements ReportBehaviour{

	@Override
	public String reportar(Soldado s){
		return "El soldado " + s.getNombre() + " con id " + s.getId() + " es un Infante";
	}
}