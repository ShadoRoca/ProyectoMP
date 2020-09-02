/**
 * Clase que define el comportamiento de mover para los soldados que se mueven a
 * caballo
 */
public class MoverACaballo implements MovementBehaviour {
	//Recibe a soldado porque este necesita cambiar la distancia a la que esta cuando se mueva.
    @Override
    public String mover(String id, String name, double distancia, Soldado s) {
        if (distancia > 0) {
        	s.setDistancia(distancia - 25.00);
            return "El soldado " + name + " con id " + id + " se mueve hacia el enemigo en caballo.";
        } else {
            return "El soldado " + name + " con id " + id + " ya alcanzo al enemigo, listo para atacar!";
        }
    }

}