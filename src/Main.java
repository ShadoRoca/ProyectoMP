public class Main{
	public static void main(String args[]){
		//El numero 100 significa la distancia que recorreran.
		//Soldado c = new Comandante("12313", "Juan", 100);
		//Estos set sirven para dotar de comportamientos al comandante.
		/*c.setMovimiento(new MoverACaballo());
		c.setAtaque(new AtacarConPistola());
		c.setReporte(new ReportarArtilleria());

		Soldado x = new Caballeria("12314", "Franciso", 100);
		Soldado z = new Artilleria("12315", "Agustin", 100);
		Soldado y = new Infanteria("12316", "Felipe", 100);

		c.add(x);
		c.add(z);
		c.add(y);
		*/

		/*FabricaEjercitos fabricaEjercitos = new FabricaEjercitos();
		Ejercito ejercito = fabricaEjercitos.getEjercito("kamikaze");
		Ejercito ejercitoEnemigo = fabricaEjercitos.getEjercito("default");

		Enemigo xd = new Enemigo();
		ejercito.setEnemigo(xd);*/

		/*ejercito.recibeOrden(2);
		ejercito.recibeOrden(2);
		ejercito.recibeOrden(3);
		ejercito.recibeOrden(1);
		ejercito.recibeOrden(2);
		ejercito.recibeOrden(3);*/

		/*ejercito.notificaOrden(3);
		ejercito.notificaOrden(2);
		ejercito.notificaOrden(1);
		ejercito.notificaOrden(1);
		System.out.println("La vida del mounstro es: " + xd.getVida());

		System.out.println(ejercito.getInfoEjercito());*/
	
		Menu juego = new Menu();

		juego.menuEjercito();
		juego.play();

	}
}