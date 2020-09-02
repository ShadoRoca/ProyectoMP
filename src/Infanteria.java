public class Infanteria extends Soldado{

	public Infanteria(String id, String n, int dist){
		this.id = id;
		this.name = n;
		this.setVida(100);
		this.setDistancia(dist); 
		this.setMovimiento(new MoverAPie());
		this.setAtaque(new AtacarConPistola());
		this.setReporte(new ReportarInfanteria());
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