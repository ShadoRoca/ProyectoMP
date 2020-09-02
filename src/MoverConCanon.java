/**
 * Clase que define el comportamiento de mover para los soldados que se mueven
 * con canon
 * Patron Strategy
 */
public class MoverConCanon implements MovementBehaviour {

    @Override
    public String mover(String id, String name, double distancia, Soldado s) {
        if (distancia > 0) {
        	s.setDistancia(distancia - 10.00);
            return "El soldado " + name + " con id " + id + " se mueve hacia el enemigo con su canon.";
        } else {
            return "El soldado " + name + " con id " + id + " ya alcanzo al enemigo, listo para atacar!";
        }
    }

}