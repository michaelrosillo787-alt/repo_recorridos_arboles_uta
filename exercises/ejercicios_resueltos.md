# Ejercicios para clase

## Ejercicio 1
### Recorridos del árbol binario

### Árbol dado

```text
        10
       /  \
      5    15
     / \   / \
    2   7 12 20
```

---

### 1. Preorden

Recorrido:

**Raíz → Izquierda → Derecha**

10 → 5 → 2 → 7 → 15 → 12 → 20

---

### 2. Inorden

Recorrido:

**Izquierda → Raíz → Derecha**

2 → 5 → 7 → 10 → 12 → 15 → 20

---

### 3. Postorden

Recorrido:

**Izquierda → Derecha → Raíz**

2 → 7 → 5 → 12 → 20 → 15 → 10
---

### 4. BFS (Por niveles)

Recorrido:

**Nivel por nivel, de izquierda a derecha**

10 → 5 → 15 → 2 → 7 → 12 → 20


## Ejercicio 2
Modifique el árbol anterior agregando los nodos 1, 3, 18 y 25. Ejecute nuevamente los recorridos.

![image alt](https://github.com/michaelrosillo787-alt/repo_recorridos_arboles_uta/blob/e956e5c959b4a91b5cc8d8f49524c3d0d69a1be5/imagenes/ejercicio_2.png)
![image alt](https://github.com/michaelrosillo787-alt/repo_recorridos_arboles_uta/blob/e956e5c959b4a91b5cc8d8f49524c3d0d69a1be5/imagenes/resultados_ejercicio_2.png)

## Ejercicio 3
Implemente una función que cuente la cantidad total de nodos del árbol.

![image alt](https://github.com/michaelrosillo787-alt/repo_recorridos_arboles_uta/blob/e956e5c959b4a91b5cc8d8f49524c3d0d69a1be5/imagenes/ejercicio_3.png)

## Ejercicio 4
Implemente una función que cuente las hojas del árbol.

![image alt](https://github.com/michaelrosillo787-alt/repo_recorridos_arboles_uta/blob/e956e5c959b4a91b5cc8d8f49524c3d0d69a1be5/imagenes/ejercicio_4.png)

## Ejercicio 5 aplicado al proyecto final

Árbol binario del sistema SmartCampus UTA

```text
                    SmartCampus UTA
                   /                \
              Usuarios             Gestión
              /       \           /        \
         Registrar   Buscar   Turnos    Documentos
```

## Explicación de los recorridos

### 5.1 Preorden — “Mostrar el menú principal”

El recorrido **Preorden** sigue el orden:

**Raíz → Izquierda → Derecha**

Primero se muestra el módulo principal del sistema y después sus submódulos.  
En **SmartCampus UTA** esto sirve para construir el menú de navegación de la plataforma:

- Primero aparece **SmartCampus UTA**
- Luego las secciones principales: **Usuarios** y **Gestión**
- Finalmente las opciones internas: **Registrar, Buscar, Turnos y Documentos**

### Ejemplo del recorrido

```text
SmartCampus UTA → Usuarios → Registrar → Buscar → Gestión → Turnos → Documentos
```

---

### 5.2 Postorden — “Procesar primero los módulos internos”

El recorrido **Postorden** sigue el orden:

**Izquierda → Derecha → Raíz**

Aquí primero se procesan los módulos hijos antes que el módulo principal.  
En el sistema SmartCampus esto sería útil para inicializar servicios o validar dependencias internas.

Por ejemplo:

- Primero se activan **Turnos** y **Documentos**
- Luego se habilita el módulo **Gestión**
- Finalmente queda disponible el sistema principal

#### Ejemplo del recorrido

```text
Registrar → Buscar → Usuarios → Turnos → Documentos → Gestión → SmartCampus UTA
```

---

### 5.3 Recorrido por niveles (BFS) — “Mostrar módulos nivel por nivel”

El recorrido **BFS (Breadth First Search)** visita los nodos por niveles.

Primero se muestran todos los módulos del mismo nivel antes de pasar al siguiente.  
En SmartCampus UTA esto puede servir para mostrar la estructura del sistema de manera progresiva en la interfaz.

#### Ejemplo del recorrido

```text
SmartCampus UTA → Usuarios → Gestión → Registrar → Buscar → Turnos → Documentos
```

Esto permite visualizar:

1. El sistema principal
2. Los módulos generales
3. Las funcionalidades específicas
