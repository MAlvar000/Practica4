# Proyecto de Cálculo de Distancia de Edición entre Palabras

Este proyecto tiene como objetivo calcular la **distancia de edición** (también conocida como **distancia de Levenshtein**) entre dos palabras, utilizando programación dinámica. Esta métrica indica el número mínimo de operaciones necesarias (inserciones, eliminaciones o sustituciones) para transformar una palabra en otra.

## Estructura del Proyecto

El proyecto está organizado en dos paquetes principales:

1. **palabras**: Contiene la clase `DistanciaEntrePalabras`, que implementa el algoritmo de cálculo de distancia de edición.
2. **aplicacion**: Contiene la clase `Principal`, que ejecuta el programa y muestra el resultado por consola.

## Clases

### DistanciaEntrePalabras

La clase `DistanciaEntrePalabras` ofrece un método estático `calculadoraDistancias` que recibe dos cadenas de texto y devuelve la distancia de edición entre ambas, usando una matriz para calcular el valor óptimo de manera eficiente.

### Principal

La clase `Principal` recibe dos palabras como argumentos desde la línea de comandos, calcula la distancia de edición entre ellas usando la clase `DistanciaEntrePalabras` y muestra el resultado en pantalla.

## Ejecución del Proyecto

Para ejecutar este proyecto, necesitas compilar las clases y proporcionar las dos palabras como argumentos. Aquí tienes un ejemplo de cómo hacerlo:

1. Compilar las clases:
   ```sh
   javac palabras/DistanciaEntrePalabras.java
   javac aplicacion/Principal.java
