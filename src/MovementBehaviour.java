/**
 * Interfaz para definir el metodo mover en sus diferentes comportamientos para los soldados
 * Patron Strategy
 */
public interface MovementBehaviour {

    /**
     * Hace que un soldado se mueva, cada tipo de soldado lo hace de manera diferente
     * @param id el id del soldado
     * @param name el nombre del soldado
     * @return el string que se mostrara en consola con la informacion de la accion
     */
    public String mover(Soldado s);

}