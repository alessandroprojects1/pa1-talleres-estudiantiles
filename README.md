# PA1 - Evaluación aplicada sobre estructuras lineales estáticas

> **Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial
> **Código:** 30710 
> **Evaluación:** [PA1]

## Integrantes: 

| Integrante | Rol | Aporte principal |
|---|---|---|
| [José Fernando Frias Díaz] | [Rol] | [100%] |
| [Gianfranco Arturo Bernal Saravia] | [Rol] | [100%] |
| [Martha Sofia Lozano Paredes] | [Rol] | [100%] |
| [Yanhira Lizeth Gutiérrez Pérez] | [Rol] | [100%] |
| [Alessandro Ismael Gallo Quiroz] | [Rol] | [100%] |

------------------------------------------------------------------------------------------

## ACTIVIDAD 1 - Análisis del problema y selección de estructura
**1. Diferencia entre estructura estática y dinámica**

Una estructura estática es aquella en la que la cantidad de datos que podemos almacenar ya está definida desde el inicio (por ejemplo, un arreglo con una cantidad fija de espacios). En cambio, una estructura dinámica puede aumentar o disminuir su tamaño mientras se ejecuta el programa. En este trabajo utilizamos estructuras estáticas porque trabajamos directamente con arreglos y matrices.

**2. ¿Por qué usar arreglos y matrices?**

Los arreglos nos sirven para guardar datos de forma ordenada; por ejemplo, para registrar cuántos alumnos están inscritos en cada taller.

Las matrices nos permiten organizar información utilizando filas y columnas, lo cual nos ayuda a gestionar datos relacionados, como la cantidad de estudiantes según el aula y el horario.
Por estas razones, los arreglos y matrices son herramientas muy útiles para organizar y revisar la información de los talleres de manera eficiente.

**3. Relación entre dato, algoritmo y estructura de datos
Estos tres conceptos trabajan en conjunto:**

Dato: Es la información base que manejamos, por ejemplo, la cantidad de alumnos inscritos.

Estructura de datos: Es la forma en la que guardamos y ordenamos esa información (como los arreglos y las matrices).

Algoritmo: Son los pasos lógicos que seguimos para trabajar con esos datos (como buscar el número mayor, ordenar los elementos o calcular totales).

**En resumen:** primero tenemos los datos, luego los organizamos utilizando una estructura de datos y, finalmente, aplicamos un algoritmo para poder procesarlos y trabajar con ellos.



## ACTIVIDAD 2 - Modelado y operaciones con vectores


**1. Problema:**  
Desarrollo de un sistema en Java para la gestión de colecciones de datos estáticos (vectores y matrices), requiriendo la implementación eficiente de algoritmos fundamentales de búsqueda, inserción con desplazamiento y ordenamiento sin utilizar estructuras dinámicas avanzadas.

**2. Objetivo:**  
Implementar y demostrar el uso correcto de estructuras de datos estáticas en Java mediante operaciones de búsqueda (mayor y menor elemento), inserción ordenada manteniendo la estructura del vector y ordenamiento por métodos de intercambio, asegurando un rendimiento óptimo en la lógica de backend.

**3. Solución desarrollada:**  
Se desarrolló una clase en Java que procesa arreglos unidimensionales estáticos. La solución incluye la lógica algorítmica para buscar valores extremos dentro del vector, desplazar elementos de manera controlada para insertar nuevos datos sin sobrescribir información y aplicar algoritmos de ordenamiento para estructurar los datos correctamente.


**Cómo ejecutar o revisar**

```bash
# Clona el repositorio en tu computadora
git clone [https://github.com/alessandroprojects1/pa1-talleres-estudiantiles.git](https://github.com/alessandroprojects1/pa1-talleres-estudiantiles.git)

# Entra a la carpeta del proyecto
cd pa1-talleres-estudiantiles/Activ2-OperacionesVectores

# Compila y ejecuta el archivo principal en tu terminal o IDE de preferencia (IntelliJ IDEA)
javac src/TallerInscritos.java
java src.TallerInscritos
```
**4. Evidencias**


<img width="652" height="577" alt="evidencias" src="https://github.com/user-attachments/assets/e59a40ea-6b6b-4fc1-b1fb-cf3646d63dde" />



## Actividad 3. Matrices y recorrido completo de datos

**1. Problema:**  
La institución necesita registrar y analizar la ocupación de estudiantes en las aulas mediante una estructura matricial, donde cada fila representa un aula (4 en total) y cada columna representa un bloque horario (5 en total), requiriendo un procesamiento automatizado para calcular totales por aula, por horario e identificar picos de máxima ocupación.

**2. Objetivo:**  
Diseñar e implementar una solución en Java utilizando una matriz bidimensional de 4x5 para procesar, sumar y analizar la distribución de estudiantes, aplicando algoritmos de recorrido por filas y columnas para la toma de decisiones institucionales.

**3. Solución desarrollada:**  
Se desarrolló el programa `Actividad3` en Java que modela la ocupación de las aulas mediante una matriz bidimensional estática. La solución incluye:
- **Representación matricial:** Una matriz de 4 filas (aulas de índices 0 a 3) y 5 columnas (bloques horarios de índices 0 a 4).
- **Cálculo por filas:** Algoritmo que recorre cada fila para sumar la cantidad total de estudiantes acumulados por aula.
- **Cálculo por columnas:** Algoritmo que recorre cada columna de manera vertical para obtener el total de estudiantes por bloque horario.
- **Búsqueda de máximo:** Algoritmo de recorrido completo (`for` anidado) que compara cada celda para encontrar el valor máximo de ocupación y su ubicación exacta `[fila][columna]`.
- **Por qué requiere recorrer varias posiciones:** Esta actividad exige recorrer múltiples posiciones porque los datos están distribuidos en dos dimensiones (espacio y tiempo). Para procesar totales o buscar un valor extremo, es indispensable visitar cada intersección de la matriz utilizando bucles anidados que controlen de manera independiente los índices de las filas y las columnas.

**Cómo ejecutar o revisar:**

```bash
# Clona el repositorio en tu computadora
git clone [https://github.com/alessandroprojects1/pa1-talleres-estudiantiles.git](https://github.com/alessandroprojects1/pa1-talleres-estudiantiles.git)

# Entra a la carpeta del proyecto (o compila directamente el archivo)
cd pa1-talleres-estudiantiles

# Compila y ejecuta el archivo Actividad3.java con Java
javac Actividad3.java
java Actividad3
```
**4. Evidencia**


<img width="560" height="707" alt="evidencia2" src="https://github.com/user-attachments/assets/b894b827-6679-48e5-b3a5-bb27684749af" />







## Actividad 4. Matrices especiales y decisión técnica



## 5. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia de participación |
|---|---|---|---|---|---|
| [José Fernando Frias Díaz] | [Alta] | [Alta] | [Alta] | [Sí] | [Commits, avances, etc.] |
| [Gianfranco Arturo Bernal Saravia] | [Alta] | [Alta] | [Alta] | [Sí] | [Commits, avances, etc.] |
| [Martha Sofia Lozano Paredes] | [Alta] | [Alta] | [Alta] | [Sí] | [Commits, avances, etc.] |
| [Nombre 4] | [Alta] | [Alta] | [Alta] | [Sí] | [Commits, avances, etc.] |
| [Alessandro Ismael Gallo Quiroz] | [Alta] | [Alta] | [Alta] | [Sí] | [Commits, avances, etc.] |


## 6. Video de exposición

**Video público de YouTube:** [PEGAR AQUÍ EL ENLACE]

## 7. Conclusiones

- [Conclusión 1]
- [Conclusión 2]
- [Conclusión 3]

---

**Última actualización:** [DD/MM/AAAA]
