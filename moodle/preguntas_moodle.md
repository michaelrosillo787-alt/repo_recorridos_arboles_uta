# Banco de preguntas para Moodle

## Preguntas tipo opción múltiple

1. ¿Cuál es el orden del recorrido Inorden?
   - A. Raíz, izquierda, derecha
   - [x] B. Izquierda, raíz, derecha
   - C. Izquierda, derecha, raíz
   - D. Nivel por nivel

2. ¿Qué estructura utiliza BFS?
   - A. Pila
   - B. Lista circular
   - [x] C. Cola
   - D. Árbol AVL

3. ¿Cuál recorrido visita primero la raíz?
   - A. Inorden
   - [x] B. Preorden
   - C. Postorden
   - D. BFS únicamente

4. ¿Cuál recorrido procesa la raíz al final?
   - A. Preorden
   - B. Inorden
   - [x] C. Postorden
   - D. Nivel por nivel

5. En un BST, el recorrido Inorden permite obtener:
   - A. Elementos desordenados
   - B. Elementos por niveles
   - [x] C. Elementos en orden ascendente
   - D. Solo hojas

## Pregunta práctica
Complete el código C++ del recorrido inorden:

```cpp
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    _____________(raiz->izquierda);
    cout << raiz->dato << " ";
    _____________(raiz->derecha);
}
```

Respuesta esperada: inorden

Resultado:
```cpp
void inorden(Nodo* raiz) {
    if (raiz == nullptr) return;
    inorden(raiz->izquierda);
    cout << raiz->dato << " ";
    inorden(raiz->derecha);
}
```
