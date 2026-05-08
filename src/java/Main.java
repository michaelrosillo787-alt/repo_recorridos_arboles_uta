import java.util.LinkedList;
import java.util.Queue;

class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}

public class Main {

    public static void preorden(Nodo raiz) {
        if (raiz == null)
            return;
        System.out.print(raiz.dato + " ");
        preorden(raiz.izquierda);
        preorden(raiz.derecha);
    }

    public static void inorden(Nodo raiz) {
        if (raiz == null)
            return;
        inorden(raiz.izquierda);
        System.out.print(raiz.dato + " ");
        inorden(raiz.derecha);
    }

    public static void postorden(Nodo raiz) {
        if (raiz == null)
            return;
        postorden(raiz.izquierda);
        postorden(raiz.derecha);
        System.out.print(raiz.dato + " ");
    }

    public static void bfs(Nodo raiz) {
        if (raiz == null)
            return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo actual = cola.poll();
            System.out.print(actual.dato + " ");

            if (actual.izquierda != null)
                cola.add(actual.izquierda);
            if (actual.derecha != null)
                cola.add(actual.derecha);
        }
    }

    public static Nodo insertar(Nodo raiz, int dato) {
        if (raiz == null) {
            return new Nodo(dato);
        }
        if (dato < raiz.dato) {
            raiz.izquierda = insertar(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = insertar(raiz.derecha, dato);
        }
        return raiz;
    }

    public static Nodo encontrarMin(Nodo raiz) {
        while (raiz.izquierda != null) {
            raiz = raiz.izquierda;
        }
        return raiz;
    }

    public static Nodo eliminar(Nodo raiz, int dato) {
        if (raiz == null)
            return raiz;

        if (dato < raiz.dato) {
            raiz.izquierda = eliminar(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = eliminar(raiz.derecha, dato);
        } else {
            // Nodo con un solo hijo o sin hijos
            if (raiz.izquierda == null) {
                return raiz.derecha;
            } else if (raiz.derecha == null) {
                return raiz.izquierda;
            }

            // Nodo con dos hijos
            Nodo temp = encontrarMin(raiz.derecha);
            raiz.dato = temp.dato;
            raiz.derecha = eliminar(raiz.derecha, temp.dato);
        }
        return raiz;
    }

    public static int contarNodos(Nodo raiz) {
        if (raiz == null) return 0;
        return 1 + contarNodos(raiz.izquierda) + contarNodos(raiz.derecha);
    }

    public static int contarHojas(Nodo raiz) {
        if (raiz == null) return 0;
        if (raiz.izquierda == null && raiz.derecha == null) return 1;
        return contarHojas(raiz.izquierda) + contarHojas(raiz.derecha);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Nodo raiz = null;

        // Nodos iniciales por defecto
        raiz = insertar(raiz, 10);
        insertar(raiz, 5);
        insertar(raiz, 15);
        insertar(raiz, 2);
        insertar(raiz, 7);
        insertar(raiz, 12);
        insertar(raiz, 20);
        
        // Ejercicio 2: Agregando nodos adicionales
        insertar(raiz, 1);
        insertar(raiz, 3);
        insertar(raiz, 18);
        insertar(raiz, 25);

        int opcion;

        do {
            System.out.println("\n--- MENU DE ARBOL BINARIO ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Eliminar nodo");
            System.out.println("3. Mostrar recorridos");
            System.out.println("4. Contar nodos totales (Ejercicio 3)");
            System.out.println("5. Contar hojas (Ejercicio 4)");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    int valorInsertar = scanner.nextInt();
                    raiz = insertar(raiz, valorInsertar);
                    System.out.println("Nodo insertado.");
                    break;
                case 2:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    raiz = eliminar(raiz, valorEliminar);
                    System.out.println("Nodo eliminado (si existia).");
                    break;
                case 3:
                    System.out.print("\nPreorden: ");
                    preorden(raiz);
                    System.out.print("\nInorden: ");
                    inorden(raiz);
                    System.out.print("\nPostorden: ");
                    postorden(raiz);
                    System.out.print("\nBFS: ");
                    bfs(raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nCantidad total de nodos: " + contarNodos(raiz));
                    break;
                case 5:
                    System.out.println("\nCantidad total de hojas: " + contarHojas(raiz));
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
