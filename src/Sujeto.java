
/*Interfaz que nos ayuda a implementar el patron Observer, puedo registrar o eliminar Observadores (Soldados) 
y los notifica cuando se haya dado una nueva orden*/
public interface Sujeto{
	public void add(Comandante c);
	public void remove(Comandante c);
	public void notificaOrden(int i);
}