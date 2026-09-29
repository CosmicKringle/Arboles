class Nodo {
    int info;
    Nodo izq;
    Nodo der;

    Nodo(int info) {
        this.info = info;
        this.izq = null;
        this.der = null;
    }
}
class Arbol {
    Nodo raiz;

    Arbol() {
        raiz = null;
    }

    void insertar(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            insertarNodo(raiz, valor);
        }
    }

    void insertarNodo(Nodo actual, int valor) {
        if (valor < actual.info) {
            if (actual.izq == null) {
                actual.izq = new Nodo(valor);
            } else {
                insertarNodo(actual.izq, valor);
            }
        } else if (valor > actual.info) {
            if (actual.der == null) {
                actual.der = new Nodo(valor);
            } else {
                insertarNodo(actual.der, valor);
            }
        } else {
            System.out.println("El valor ya existe en el árbol");
        }
    }

    void preorden(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.info + " ");
            preorden(actual.izq);
            preorden(actual.der);
        }
    }
    
    void inorden(Nodo actual) {
        if (actual != null) {
            inorden(actual.izq);
            System.out.print(actual.info + " ");
            inorden(actual.der);
        }
    }

    void postorden(Nodo actual) {
        if (actual != null) {
            postorden(actual.izq);
            postorden(actual.der);
            System.out.print(actual.info + " ");
        }
    }

    void preorden() {
        preorden(raiz);
    }
    void inorden() {
        inorden(raiz);
    }
    void postorden() {
        postorden(raiz);
    }
}

