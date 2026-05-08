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

## Contenido

| Carpeta | Descripción |
|---|---|
| `docs/` | Guía práctica para la clase |
| `src/cpp/` | Implementación completa en C++ |
| `src/java/` | Implementación completa en Java |
| `exercises/` | Ejercicios para trabajo grupal |
| `moodle/` | Banco de preguntas tipo Moodle |
| `assets/` | Recursos de apoyo |

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

## Actividad sugerida (¡Completada en el código actual!):

1. ~~Clonar el repositorio.~~ (Hecho)
2. ~~Ejecutar el código base.~~ (Hecho)
3. ~~Agregar mínimo 5 nodos nuevos.~~ (Hecho: menú dinámico y precarga automática de nodos)
4. ~~Mostrar los cuatro recorridos.~~ (Hecho: integrado en la Opción 3 del menú)
5. ~~Modificar el caso de aplicación al proyecto final.~~ 
6. Subir evidencias al repositorio GitHub del grupo.

## Entregables

- Captura de ejecución en consola.
- Código fuente comentado.
- README del grupo.
- Explicación del caso real.
- Link del repositorio GitHub.

## Rúbrica breve sobre 10 puntos

| Criterio | Puntaje |
|---|---:|
| Implementación correcta de recorridos | 3 |
| Uso correcto de recursividad y cola | 2 |
| Código comentado y organizado | 1.5 |
| Aplicación al proyecto final | 2 |
| Uso de GitHub e IA documentada | 1.5 |

