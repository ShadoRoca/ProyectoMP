public class Enemigo{
	String nombre;
	double vida;

	public Enemigo(){
		this.nombre = "Mounstro >:)";
		this.vida = 1000.0;
	}

	public void setNombre(String s){
		nombre = s;
	}


	public void setVida(double d){
		vida = d;
	}

	public String getNombre(){
		return nombre;
	}

	public double getVida(){
		return vida;
	}
	
}
