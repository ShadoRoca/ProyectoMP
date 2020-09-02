import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Comandante extends Soldado{
	List<Soldado> subordinados;

	public Comandante(String id, String n, int dist){
		this.subordinados = new ArrayList<Soldado>();
		this.name = n;
		this.id = id;
		this.distancia = dist;
	}

	public void add(Soldado s){
		subordinados.add(s);
	}

	public void remove(Soldado s){
		subordinados.remove(s);
	}

	public Soldado getChild(int i){
		return (Soldado)subordinados.get(i);
	}

	public void ordenar(int i){
		Iterator iterador;
		switch(i){
			case 1:
				System.out.println("Les ordeno ataquen!");
				ataca();
				iterador = subordinados.iterator();
				while(iterador.hasNext()){
					Soldado s = (Soldado)iterador.next();
					s.ordenar(i);
				}
				break;

			case 2:
				System.out.println("Les ordeno moverse!");
				moverse();
				iterador = subordinados.iterator();
				while(iterador.hasNext()){
					Soldado s = (Soldado)iterador.next();
					s.ordenar(i);
				}
				break;

			case 3:
				System.out.println("Les ordeno reportarse!");
				reportarse();
				iterador = subordinados.iterator();
				while(iterador.hasNext()){
					Soldado s = (Soldado)iterador.next();
					s.ordenar(i);
				}
				break;

			default:
				return;
		}
		
	}
}