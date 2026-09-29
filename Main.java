public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        arbol.insertar(14);
        arbol.insertar(15);
        arbol.insertar(4);
        arbol.insertar(9);
        arbol.insertar(7);
        arbol.insertar(18);
        arbol.insertar(3);
        arbol.insertar(5);
        arbol.insertar(16);
        arbol.insertar(4);
        arbol.insertar(20);
        arbol.insertar(17);
        arbol.insertar(9);
        arbol.insertar(5);

        System.out.println("Preorden:");
        arbol.preorden();
        System.out.println("\nInorden:");
        arbol.inorden();
        System.out.println("\nPostorden:");
        arbol.postorden();
    }
}
