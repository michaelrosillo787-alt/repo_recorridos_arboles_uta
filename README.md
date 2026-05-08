# Recorridos de Árboles Binarios - Estructura de Datos

**Universidad Técnica de Ambato**  
**Carrera:** Ingeniería de Software  
**Asignatura:** Estructura de Datos  
**Curso:** Tercero B  
**Tema:** Recorridos de árboles binarios: Inorden, Preorden, Postorden y BFS

## Objetivo general
Implementar y analizar los principales recorridos de árboles binarios utilizando C++ y Java, aplicando estructuras de datos dinámicas, recursividad y colas.

## Resultados de aprendizaje
Al finalizar la práctica, el estudiante será capaz de:

1. Explicar la diferencia entre recorridos DFS y BFS.
2. Implementar recorridos Inorden, Preorden y Postorden con recursividad.
3. Implementar BFS usando una cola.
4. Comparar la implementación en C++ y Java.
5. Aplicar recorridos de árboles a un caso real del proyecto final.

## Características Implementadas (Novedades)

El código base original fue adaptado para resolver los ejercicios planteados, incluyendo:
1. **Menú Interactivo**: Interfaz por consola para operar sobre el árbol en tiempo real.
2. **Insertar nodos (BST)**: Inserción dinámica que respeta las reglas de un Árbol Binario de Búsqueda.
3. **Eliminar nodos**: Lógica segura para eliminar hojas, nodos con un hijo y nodos con dos hijos.
4. **Contar Nodos y Hojas**: Funciones recursivas adicionales para obtener el número total de nodos y de hojas.
5. **Precarga automática**: El árbol se inicializa por defecto con los nodos de los Ejercicios 1 y 2 `(10, 5, 15, 2, 7, 12, 20, 1, 3, 18, 25)` para facilitar las pruebas.

## Funcionamiento
### 1. Estructura del Nodo (`Nodo`)

La base del árbol es la estructura o clase `Nodo`.  
Cada nodo almacena:

- Un valor entero (`dato` en Java / `valor` o `dato` en C++).
- Una referencia o puntero hacia su hijo izquierdo (`izquierda`).
- Una referencia o puntero hacia su hijo derecho (`derecha`).

---

### 2. Operaciones principales del árbol

El código cuenta con métodos recursivos para manipular la estructura del árbol.

### Insertar (`insertar`)

Agrega un nuevo valor al árbol manteniendo la regla de un árbol binario de búsqueda:

- Si el valor es menor que el nodo actual, se inserta hacia la izquierda.
- Si el valor es mayor, se inserta hacia la derecha.

---

### Eliminar (`eliminar`)

Busca un valor específico y lo elimina del árbol.  
Para mantener correctamente la estructura, maneja tres casos:

1. **Nodo sin hijos (hoja):**
   - El nodo simplemente se elimina.

2. **Nodo con un solo hijo:**
   - El hijo reemplaza al nodo eliminado.

3. **Nodo con dos hijos:**
   - Se busca el valor mínimo del subárbol derecho (`encontrarMin`).
   - Ese valor reemplaza al nodo eliminado.
   - Luego se elimina el nodo duplicado.

---

### 3. Recorridos del árbol

El programa implementa cuatro recorridos clásicos.

### Preorden (`preorden`)

Recorre:

```text
Raíz → Izquierda → Derecha
```

Primero visita la raíz y luego sus subárboles.

---

### Inorden (`inorden`)

Recorre:

```text
Izquierda → Raíz → Derecha
```

En un árbol binario de búsqueda, este recorrido muestra los valores ordenados de menor a mayor.

---

### Postorden (`postorden`)

Recorre:

```text
Izquierda → Derecha → Raíz
```

Primero visita los hijos y finalmente la raíz.

---

### BFS o recorrido por niveles (`bfs`)

Utiliza una estructura tipo Cola (`Queue`) para recorrer el árbol nivel por nivel:

```text
De arriba hacia abajo y de izquierda a derecha
```

---

### 4. Funciones de conteo

### Contar nodos (`contarNodos`)

Recorre el árbol recursivamente y suma `1` por cada nodo encontrado.

Devuelve:

```text
Cantidad total de nodos del árbol
```

---

### Contar hojas (`contarHojas`)

Recorre el árbol y únicamente cuenta los nodos que no tienen hijos:

```text
izquierda == null && derecha == null
```

Devuelve:

```text
Cantidad total de hojas del árbol
```

---

### 5. Flujo del programa principal (`main`)

### Inicialización

Se crea un árbol vacío inicializando la raíz en `null`.

---

### Carga de datos por defecto

El programa inserta automáticamente los siguientes valores:

```text
10, 5, 15, 2, 7, 12, 20
```

Luego agrega nodos adicionales correspondientes al ejercicio:

```text
1, 3, 18, 25
```

---

### Menú interactivo

El programa entra en un ciclo `do-while` que muestra un menú con seis opciones:

1. Insertar un valor manualmente.
2. Eliminar un valor manualmente.
3. Imprimir los recorridos:
   - Preorden
   - Inorden
   - Postorden
   - BFS
4. Mostrar el total de nodos.
5. Mostrar el total de hojas.
6. Salir del programa.

---

### Funcionamiento general

Las opciones seleccionadas por el usuario se ejecutan mediante un bloque `switch`.

El programa continúa funcionando hasta que el usuario selecciona la opción:

```text
6 → Salir
```

## Contenido

| Carpeta | Descripción |
|---|---|
| `docs/` | Guía práctica para la clase |
| `exercises/` | Ejercicios para trabajo grupal |
| `imagenes/` | Imagenes de evidencia |
| `moodle/` | Banco de preguntas tipo Moodle |
| `src/cpp/` | Implementación completa en C++ |
| `src/java/` | Implementación completa en Java |


## Reglas de recorrido

| Recorrido | Orden |
|---|---|
| Inorden | Izquierda → Raíz → Derecha |
| Preorden | Raíz → Izquierda → Derecha |
| Postorden | Izquierda → Derecha → Raíz |
| BFS | Nivel por nivel usando cola |

## Ejecución en C++

```bash
cd src/cpp
g++ main.cpp -o recorridos
./recorridos
```

## Ejecución en Java

```bash
cd src/java
javac Main.java
java Main
```


