
/**
 * Clase que utilizaremos para implemebtar los patrones de Composite y Strategy, tambien es la clase base
 * para Comandante y los tres tipos de soldado que existen.
 */

public abstract class Soldado {

	String id;
	String name;
	double distancia;
	double vida;
	AttackBehaviour ataque;
	MovementBehaviour movimiento;
	ReportBehaviour reporte;


	public void add(Soldado s){}

	public void remove(Soldado s){}

	public Soldado getChild(int i){
		return null;
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
		System.out.println(ataque.atacar(id,name,distancia));
	}

	public void moverse(){
		System.out.println(movimiento.mover(id,name,distancia,this));
	}

	public void reportarse(){
		System.out.println(reporte.reportar(id,name));
	}

}