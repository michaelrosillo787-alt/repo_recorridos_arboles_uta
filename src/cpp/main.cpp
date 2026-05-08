#include <iostream>
#include <queue>
using namespace std;

struct Nodo {
  int dato;
  Nodo *izquierda;
  Nodo *derecha;

  Nodo(int valor) {
    dato = valor;
    izquierda = nullptr;
    derecha = nullptr;
  }
};

void preorden(Nodo *raiz) {
  if (raiz == nullptr)
    return;
  cout << raiz->dato << " ";
  preorden(raiz->izquierda);
  preorden(raiz->derecha);
}

void inorden(Nodo *raiz) {
  if (raiz == nullptr)
    return;
  inorden(raiz->izquierda);
  cout << raiz->dato << " ";
  inorden(raiz->derecha);
}

void postorden(Nodo *raiz) {
  if (raiz == nullptr)
    return;
  postorden(raiz->izquierda);
  postorden(raiz->derecha);
  cout << raiz->dato << " ";
}

void bfs(Nodo *raiz) {
  if (raiz == nullptr)
    return;

  queue<Nodo *> cola;
  cola.push(raiz);

  while (!cola.empty()) {
    Nodo *actual = cola.front();
    cola.pop();

    cout << actual->dato << " ";

    if (actual->izquierda != nullptr)
      cola.push(actual->izquierda);
    if (actual->derecha != nullptr)
      cola.push(actual->derecha);
  }
}

Nodo *insertar(Nodo *raiz, int valor) {
  if (raiz == nullptr) {
    return new Nodo(valor);
  }
  if (valor < raiz->dato) {
    raiz->izquierda = insertar(raiz->izquierda, valor);
  } else if (valor > raiz->dato) {
    raiz->derecha = insertar(raiz->derecha, valor);
  }
  return raiz;
}

Nodo *encontrarMin(Nodo *raiz) {
  while (raiz->izquierda != nullptr) {
    raiz = raiz->izquierda;
  }
  return raiz;
}

Nodo *eliminar(Nodo *raiz, int valor) {
  if (raiz == nullptr)
    return raiz;

  if (valor < raiz->dato) {
    raiz->izquierda = eliminar(raiz->izquierda, valor);
  } else if (valor > raiz->dato) {
    raiz->derecha = eliminar(raiz->derecha, valor);
  } else {
    // Nodo con un solo hijo o sin hijos
    if (raiz->izquierda == nullptr) {
      Nodo *temp = raiz->derecha;
      delete raiz;
      return temp;
    } else if (raiz->derecha == nullptr) {
      Nodo *temp = raiz->izquierda;
      delete raiz;
      return temp;
    }

    // Nodo con dos hijos
    Nodo *temp = encontrarMin(raiz->derecha);
    raiz->dato = temp->dato;
    raiz->derecha = eliminar(raiz->derecha, temp->dato);
  }
  return raiz;
}

int contarNodos(Nodo *raiz) {
  if (raiz == nullptr) return 0;
  return 1 + contarNodos(raiz->izquierda) + contarNodos(raiz->derecha);
}

int contarHojas(Nodo *raiz) {
  if (raiz == nullptr) return 0;
  if (raiz->izquierda == nullptr && raiz->derecha == nullptr) return 1;
  return contarHojas(raiz->izquierda) + contarHojas(raiz->derecha);
}

int main() {
  Nodo *raiz = nullptr;

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

  int opcion, valor;

  do {
    cout << "\n--- MENU DE ARBOL BINARIO ---" << endl;
    cout << "1. Insertar nodo" << endl;
    cout << "2. Eliminar nodo" << endl;
    cout << "3. Mostrar recorridos" << endl;
    cout << "4. Contar nodos totales (Ejercicio 3)" << endl;
    cout << "5. Contar hojas (Ejercicio 4)" << endl;
    cout << "6. Salir" << endl;
    cout << "Ingrese una opcion: ";
    cin >> opcion;

    switch (opcion) {
    case 1:
      cout << "Ingrese el valor a insertar: ";
      cin >> valor;
      raiz = insertar(raiz, valor);
      cout << "Nodo insertado." << endl;
      break;
    case 2:
      cout << "Ingrese el valor a eliminar: ";
      cin >> valor;
      raiz = eliminar(raiz, valor);
      cout << "Nodo eliminado (si existia)." << endl;
      break;
    case 3:
      cout << "\nPreorden: ";
      preorden(raiz);
      cout << "\nInorden: ";
      inorden(raiz);
      cout << "\nPostorden: ";
      postorden(raiz);
      cout << "\nBFS: ";
      bfs(raiz);
      cout << endl;
      break;
    case 4:
      cout << "\nCantidad total de nodos: " << contarNodos(raiz) << endl;
      break;
    case 5:
      cout << "\nCantidad total de hojas: " << contarHojas(raiz) << endl;
      break;
    case 6:
      cout << "Saliendo..." << endl;
      break;
    default:
      cout << "Opcion no valida." << endl;
    }
  } while (opcion != 6);

  return 0;
}
