/**
 * Clase que define el comportamiento de reportarse para los artilleros.
 * Patron Strategy
 */
public class ReportarArtilleria implements ReportBehaviour{

	@Override
	public String reportar(Soldado s){
		return "El soldado " + s.getNombre() + " con id " + s.getId() + " es un Artillero.";
	}
}