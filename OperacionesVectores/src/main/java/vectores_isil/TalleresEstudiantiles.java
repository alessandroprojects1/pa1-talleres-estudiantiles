package vectores_isil;

import java.util.Arrays;
import java.util.Scanner;

public class TalleresEstudiantiles {
    public static void main(String[] args) {
        int[] valores = {28, 15, 34, 21, 19, 40, 12, 26};

        System.out.println("\n*** VECTOR INICIAL ***");
        System.out.println("Inscritos por taller: " + Arrays.toString(valores));

        //MAYOR Y MENOR
        int mayor= valores[0];
        int menor=valores[0];
        for (int i=0; i< valores.length; i++){
            if (valores[i]>mayor){
                mayor = valores[i];
            }
            if (valores[i]<menor){
                menor = valores[i];
            }
        }
        System.out.println("\n*** VALOR MAYOR Y MENOR ***");
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);


        //AGREGAR NUEVO VALOR
        var consola = new Scanner(System.in);
        int[] valoresAmpliado = new int[valores.length + 1];

        for (int i = 0; i < valores.length; i++){
            valoresAmpliado[i] = valores[i];
        }

        System.out.println("\n*** INSERCIÓN DE NUEVO VALOR ***");
        System.out.println("Vector actual: " + Arrays.toString(valores));

        System.out.println("Ingrese la posición donde desea insertar (0 al 8): ");
        var posicion=Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la cantidad de inscritos del nuevo taller: ");
        var nuevoValor=Integer.parseInt(consola.nextLine());

        for (int i = valoresAmpliado.length - 1; i > posicion; i--) {
            valoresAmpliado[i] = valoresAmpliado[i - 1];
        }
        valoresAmpliado[posicion] = nuevoValor;

        System.out.println("\nVector después de la inserción: ");
        System.out.println(Arrays.toString(valoresAmpliado));

        //DE MENOR A MAYOR
        int[] vectorOrdenar = Arrays.copyOf(valores, valores.length);

        for (int i = 0; i < vectorOrdenar.length - 1; i++) {
            for (int j = 0; j < vectorOrdenar.length - 1 - i; j++) {
                if (vectorOrdenar[j] > vectorOrdenar[j + 1]) {
                    // Intercambio (Swap)
                    int aux = vectorOrdenar[j];
                    vectorOrdenar[j] = vectorOrdenar[j + 1];
                    vectorOrdenar[j + 1] = aux;
                }
            }
        }
        System.out.println("\n*** VALOR DE MENOR A MAYOR ***");
        System.out.println("Vector ordenado: " + Arrays.toString(vectorOrdenar));

    }
}
