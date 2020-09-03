public class Menu {
    
    FabricaEjercitos fabricaEjercitos;
    Ejercito ejercito;

    
    public void MenuEjercito(int i) {
        System.out.println("Escoge un ejercito, se muestra la informacion de cada uno...");
        System.out.println(
                "1 - EJERCITO EXPLORADOR: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados de infantería.\nPelotón 2 se compone con 1 artillero y 2 miembros de la caballería.\nPelotón 3 se compone con 6 soldados, todos miembros de la caballería.");
        System.out.println(
                "2 - EJERCITO DEFAULT: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados, todos miembros de la infantería.\nPelotón 2 tiene 3 artilleros.\nPelotón 3 tiene 6 miembros de la caballería.");
        System.out.println(
                "3 - EJERCITO KAMIKAZE: Se conforma de 3 pelotones.\nPelotón 1 y 2 tienen 5 soldados cada uno, todos miembros de la infantería.\nPelotón 3 tiene 5 soldados, todos miembros de la caballería.");
        switch (i) {
            case 1:
                ejercito = fabricaEjercitos.getEjercito("explorador");
                break;
            case 2:
                ejercito = fabricaEjercitos.getEjercito("default");
                break;
            case 3:
                ejercito = fabricaEjercitos.getEjercito("kamikaze");
                break;
            default:
                System.out.println("No es una opcion valida, vuelve a escoger...");
                break;
        }
    }

}