import java.util.Scanner;

public class Menu {

    FabricaEjercitos fabricaEjercitos = new FabricaEjercitos();
    Ejercito ejercito;

    
    public void MenuEjercito() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escoge un ejercito, se muestra la informacion de cada uno...");
        System.out.println(
                "1 - EJERCITO EXPLORADOR: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados de infantería.\nPelotón 2 se compone con 1 artillero y 2 miembros de la caballería.\nPelotón 3 se compone con 6 soldados, todos miembros de la caballería.");
        System.out.println(
                "2 - EJERCITO DEFAULT: Se conforma con 3 pelotones.\nPelotón 1 tienen 6 soldados, todos miembros de la infantería.\nPelotón 2 tiene 3 artilleros.\nPelotón 3 tiene 6 miembros de la caballería.");
        System.out.println(
                "3 - EJERCITO KAMIKAZE: Se conforma de 3 pelotones.\nPelotón 1 y 2 tienen 5 soldados cada uno, todos miembros de la infantería.\nPelotón 3 tiene 5 soldados, todos miembros de la caballería.");

        int i = in.nextInt();
        in.close();
        switch (i) {
            case 1:
                ejercito = fabricaEjercitos.getEjercito("explorador");
                System.out.println("Escogiste el ejercito explorador:\n" + ejercito.getInfoEjercito());
                break;
            case 2:
                ejercito = fabricaEjercitos.getEjercito("default");
                System.out.println("Escogiste el ejercito default:\n" + ejercito.getInfoEjercito());
                break;
            case 3:
                ejercito = fabricaEjercitos.getEjercito("kamikaze");
                System.out.println("Escogiste el ejercito kamikaze:\n" + ejercito.getInfoEjercito());
                break;
            default:
                System.out.println("No es una opcion valida, vuelve a escoger...");
                break;
        }
    }



}