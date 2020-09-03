public class Menu {
    FabricaEjercitos fabricaEjercitos;
    Ejercito ejercito;

    // en progreso, se supone que seria Facade
    public void MenuEjercito(int i) {
        System.out.println("Escoge un ejercito, se muestra la informacion de cada uno...");
        System.out.println();
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
                break;
        }
    }

    
}