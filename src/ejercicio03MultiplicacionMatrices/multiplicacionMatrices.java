package ejercicio03;

import java.util.Scanner;

/**
 * Clase multiplicacionMatrices.
 * 
 * Objetivo: Calcular el producto de dos matrices.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales.
 * - Ciclos for anidados.
 * - Multiplicación de matrices.
 * 
 * Ejemplo:
 * Matriz A x Matriz B → Resultado: Matriz C.
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class multiplicacionMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese filas de A: ");
        int filasA = teclado.nextInt();
        System.out.print("Ingrese columnas de A: ");
        int columnasA = teclado.nextInt();
        System.out.print("Ingrese columnas de B: ");
        int columnasB = teclado.nextInt();

        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[columnasA][columnasB];
        int[][] matrizC = new int[filasA][columnasB];

        // Se leen los elementos de la matriz A
        System.out.println("Ingrese elementos de la matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j] = teclado.nextInt();
            }
        }

        // Se leen los elementos de la matriz B
        System.out.println("Ingrese elementos de la matriz B:");
        for (int i = 0; i < columnasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j] = teclado.nextInt();
            }
        }

        // Se realiza la multiplicación de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Se muestra la matriz resultante
        System.out.println("Resultado de la multiplicación:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
