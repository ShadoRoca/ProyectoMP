import java.util.ArrayList;

public class Comandante extends Soldado {
	ArrayList<Soldado> subordinados;

	public Comandante(String id, String n, int dist) {
		this.subordinados = new ArrayList<Soldado>();
		this.name = n;
		this.id = id;
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

	public void ordenar(int i) {
		switch (i) {
			case 1:
				System.out.println("Comandante " + name + ": Les ordeno atacar!");
				ataca();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i);
				}
				break;
			case 2:
				System.out.println("Comandante " + name + ": Les ordeno moverse!");
				moverse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i);
				}
				break;
			case 3:
				System.out.println("Comandante " + name + ": Les ordeno reportarse!");
				reportarse();
				for (Soldado soldado : subordinados) {
					soldado.ordenar(i);
				}
				break;
			default:
				return;
		}

	}
}