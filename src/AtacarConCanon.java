
/**
 * Clase que define el comportamiento para atacar para los soldados que atacan con canon
 * Patron Strategy
 */
public class AtacarConCanon implements AttackBehaviour {

    @Override
    public String atacar(Soldado s) {
    	if(s.getVida() == 0){
    		return "El soldado " + s.getNombre() + " con id " + s.getId() + " no puede atacar al enemigo,"
    				+ " ya que ha perdido todos sus puntos de vida";
    	} else if(s.getDistancia() > 0){
    		return "El soldado " + s.getNombre() + " con id " + s.getId()
                    + " aun no puede atacar al enemigo, se encuentra a una distancia de " + s.getDistancia();
    	}
    	s.setVida(s.getVida()-10.00);
    	return "El soldado " + s.getNombre() + " con id " + s.getId() + " atacó al enemigo con su canon e hizo 60 puntos de daño"
        		+ "pero tambien se daño asi mismo.";
    }

}