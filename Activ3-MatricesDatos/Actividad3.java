package actividad3;

public class Actividad3 {

    public static void main(String[] args) {
        // Matriz de 4 filas (aulas) por 5 columnas (bloques horarios)
        // Índices: Filas 0 a 3, Columnas 0 a 4
        int[][] ocupacion = {
            {30, 25, 35, 20, 40}, // Aula 0
            {15, 20, 10, 25, 30}, // Aula 1
            {40, 35, 45, 40, 50}, // Aula 2
            {10, 15, 20, 10, 15}  // Aula 3
        };

        // 1. Mostrar la matriz propuesta
        System.out.println("--- Ocupación de Aulas ---");
        for (int f = 0; f < ocupacion.length; f++) {
            System.out.print("Aula " + f + ": ");
            for (int c = 0; c < ocupacion[f].length; c++) {
                System.out.print(ocupacion[f][c] + "\t");
            }
            System.out.println();
        }

        // 2. Calcular el total de estudiantes por aula (Suma de filas)
        System.out.println("\n--- Total de estudiantes por Aula ---");
        for (int f = 0; f < ocupacion.length; f++) {
            int totalAula = 0;
            for (int c = 0; c < ocupacion[f].length; c++) {
                totalAula += ocupacion[f][c];
            }
            System.out.println("Aula " + f + ": " + totalAula + " estudiantes");
        }

        // 3. Calcular el total de estudiantes por horario (Suma de columnas)
        System.out.println("\n--- Total de estudiantes por Horario ---");
        for (int c = 0; c < ocupacion[0].length; c++) {
            int totalHorario = 0;
            for (int f = 0; f < ocupacion.length; f++) {
                totalHorario += ocupacion[f][c];
            }
            System.out.println("Bloque Horario " + c + ": " + totalHorario + " estudiantes");
        }

        // 4. Identificar la celda con mayor ocupación
        System.out.println("\n--- Celda con Mayor Ocupación ---");
        int maxOcupacion = ocupacion[0][0];
        int filaMax = 0;
        int colMax = 0;

        for (int f = 0; f < ocupacion.length; f++) {
            for (int c = 0; c < ocupacion[f].length; c++) {
                if (ocupacion[f][c] > maxOcupacion) {
                    maxOcupacion = ocupacion[f][c];
                    filaMax = f;
                    colMax = c;
                }
            }
        }
        System.out.println("La mayor ocupación es de " + maxOcupacion + " estudiantes.");
        System.out.println("Se encuentra en el Aula " + filaMax + " durante el bloque horario " + colMax + ".");
        System.out.println("Índice de la matriz: [" + filaMax + "][" + colMax + "]");
        
        // Explicación de por qué se requiere recorrer varias posiciones
        System.out.println("\n--- Por qué se requiere recorrer varias posiciones ---");
        System.out.println("Esta actividad requiere recorrer varias posiciones de la matriz porque");
        System.out.println("la información (cantidad de estudiantes) está distribuida en dos dimensiones:");
        System.out.println("aulas (filas) y horarios (columnas). Para obtener totales por cada categoría");
        System.out.println("o encontrar un valor global como el máximo, es necesario visitar y comparar");
        System.out.println("o sumar cada una de las celdas implicadas (toda una fila, toda una columna o");
        System.out.println("la matriz completa).");
    }
}
