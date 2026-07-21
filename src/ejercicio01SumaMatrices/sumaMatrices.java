package ejercicio01;

import java.util.Scanner;

/**
 * Clase sumaMatrices.
 * 
 * Objetivo: Calcular la suma de dos matrices.
 * 
 * Contenido temático:
 * - Arreglos bidimensionales.
 * - Ciclos for anidados.
 * - Operaciones aritméticas.
 * 
 * Ejemplo:
 * Matriz A + Matriz B → Resultado: Matriz C.
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class sumaMatrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese filas: ");
        int filas = teclado.nextInt();
        System.out.print("Ingrese columnas: ");
        int columnas = teclado.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizC = new int[filas][columnas];

        // Se leen los elementos de la matriz A
        System.out.println("Ingrese elementos de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizA[i][j] = teclado.nextInt();
            }
        }

        // Se leen los elementos de la matriz B
        System.out.println("Ingrese elementos de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizB[i][j] = teclado.nextInt();
            }
        }

        // Se suman las dos matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Se muestra la matriz resultante
        System.out.println("Resultado de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
