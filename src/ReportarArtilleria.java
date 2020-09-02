/**
 * Clase que define el comportamiento de reportarse para los artilleros.
 * Patron Strategy
 */
public class ReportarArtilleria implements ReportBehaviour{

	@Override
	public String reportar(String id, String name){
		return "El soldado " + name + " con id " + id + " es un Artillero.";
	}
}