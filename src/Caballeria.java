public class Caballeria extends Soldado{

	public Caballeria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.vida = 100;
		this.distancia = dist;
		this.movimiento = new MoverACaballo();
		this.ataque = new AtacarConMosquete();
		this.reporte = new ReportarCaballeria();
	}

	public void ordenar(int i){
		switch(i){
			case 1:
				ataca();
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