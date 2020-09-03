/**
 * Clase que utilizaremos para implemebtar los patrones de Composite y Strategy, tambien es la clase base
 * para Comandante y los tres tipos de soldado que existen.
 */

public abstract class Soldado {

	String id;
	String name;
	private double distancia;
	private double vida;
	private AttackBehaviour ataque;
	private MovementBehaviour movimiento;
	private ReportBehaviour reporte;


	public void add(Soldado s){}

	public void remove(Soldado s){}

	public Soldado getChild(int i){
		return null;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public void setDistancia(double a){
		distancia = a;
	}

	public void setAtaque(AttackBehaviour a){
		ataque = a;
	}


	public void setMovimiento(MovementBehaviour a){
		movimiento = a;
	}


	public void setReporte(ReportBehaviour a){
		reporte = a;
	}

	public abstract void ordenar(int i);

	public String getId(){
		return id;
	}

	public String getNombre(){
		return name;
	}


	public double getDistancia(){
		return distancia;
	}

	public double getVida(){
		return vida;
	}

	public void ataca(){
		System.out.println(ataque.atacar(this));
	}

	public void moverse(){
		System.out.println(movimiento.mover(this));
	}

	public void reportarse(){
		System.out.println(reporte.reportar(this));
	}

}