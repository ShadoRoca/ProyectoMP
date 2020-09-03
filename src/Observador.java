
/*Interfaz que nos ayuda a implementar el patron Observer, tiene metodos para actualizar 
cuando se una orden nueva.*/
public interface Observador{
	public void updateOrden(int i, Enemigo e);
}