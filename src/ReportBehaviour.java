/**
 * Interfaz para definir el metodo de reportarse en sus diferentes comportamientos para los soldados
 * Patron Strategy.
 */
public interface ReportBehaviour {

    /**
     * Hace que un soldado se reporte, cada tipo de soldado lo hace de manera diferente
     * @param id el id del soldado
     * @param name el nombre del soldado
     * @return el string que se mostrara en consola con la informacion de la accion
     */
    public String reportar(String id, String name);
    
}