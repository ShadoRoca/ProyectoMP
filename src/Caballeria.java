public class Caballeria extends Soldado{

	public Caballeria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.setVida(100);
		this.setDistancia(dist);
		this.setMovimiento(new MoverACaballo());
		this.setAtaque(new AtacarConMosquete());
		this.setReporte(new ReportarCaballeria());
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
}