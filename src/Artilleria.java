
public class Artilleria extends Soldado{

	public Artilleria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.setVida(100);
		this.setDistancia(dist);
		this.setMovimiento(new MoverConCanon());
		this.setAtaque(new AtacarConCanon());
		this.setReporte(new ReportarArtilleria());
	}

	public void ordenar(int i, Enemigo e){
		switch(i){
			case 1:
				ataca(e);
				break;
			case 2:
				moverse();
				break;
			case 3:
				reportarse();
				break;
			default: 
				return;
		}
	}

	@Override
	public String getInfo() {
		return "   Soldado/a de tipo Artillero " + name + " con id " + id + "."; 
	}
}