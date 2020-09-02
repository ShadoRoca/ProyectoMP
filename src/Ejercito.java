import java.util.ArrayList;

/**
 * Clase que representa un ejercito, los pelotones son representados como
 * comandantes ya que estos ya cuentan con una lista de soldados.
 */
public abstract class Ejercito {

    private ArrayList<Comandante> comandantes = new ArrayList<>();
    private double vida;

    /**
     * Recibe la orden para ser transmitida a todos los comandantes
     * @param i la orden: 1 es atacar, 2 es mover y 3 reportar
     */
    public void recibeOrden(int i) {
        for (Comandante comandante : comandantes) {
            comandante.ordenar(i);
        }
    }

    /**
     * Añade un comandante al ejercito
     * @param comandante 
     */
    public void add(Comandante comandante) {
        comandantes.add(comandante);
    }

    /**
     * Elimina un comandante del ejercito
     * @param comandante
     */
    public void remove(Comandante comandante) {
        if (comandantes.indexOf(comandante) != -1) {
            comandantes.remove(comandante);
        } else {
            System.out.println("El comandante que intentas eliminar del ejercito, no existe");
        }
    }

    /**
     * Regresa la vida del ejercito
     * @return vida del ejercito
     */
    public double getVida() {
        return vida;
    }

    /**
     * Modifica la vida del ejercito
     * @param vida la vida actualizada
     */
    public void setVida(double vida) {
        this.vida = vida;
    }
}