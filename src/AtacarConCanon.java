/**
 * Clase que define el comportamiento para atacar para los soldados que atacan con canon
 * Patron Strategy
 */
public class AtacarConCanon implements AttackBehaviour {

    @Override
    public String atacar(String id, String name, double distancia) {
        if (distancia > 0) {
            return "El soldado " + name + " con id " + id
                    + " aun no puede atacar al enemigo, se encuentra a una distancia de " + distancia;
        }
        return "El soldado " + name + " con id " + id + " atacó al enemigo con su canon e hizo 60 puntos de daño";
    }

}