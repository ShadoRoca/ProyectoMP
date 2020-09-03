import java.util.ArrayList;

public class Comandante extends Soldado implements Observador {
	ArrayList<Soldado> subordinados;

	public Comandante(String id, String n, int dist) {
		this.subordinados = new ArrayList<Soldado>();
		this.name = n;
		this.id = id;
		this.setVida(100);
		this.setDistancia(dist);
	}

	public void add(Soldado s) {
		subordinados.add(s);
	}

	public void remove(Soldado s) {
		subordinados.remove(s);
	}

	public Soldado getChild(int i) {
		return (Soldado) subordinados.get(i);
	}

	public void updateOrden(int i, Enemigo e){
		this.ordenar(i,e);
	}

	public void ordenar(int i, Enemigo e) {
		switch (i) {
			case 1:
				System.out.println("Comandante " + name + ": Les ordeno atacar!");
				ataca(e);
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			case 2:
				System.out.println("Comandante " + name + ": Les ordeno moverse!");
				moverse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			case 3:
				System.out.println("Comandante " + name + ": Les ordeno reportarse!");
				reportarse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i,e);
				}
				break;
			default:
				return;
		}

	}

	@Override
	public String getInfo() {
		String c = " Comandante " + name + " con id " + id + "." + "\n";
		for (Soldado soldado : subordinados) {
			String r = soldado.getInfo() + "\n";
			c += r;
		} 
		return c;
	}
}