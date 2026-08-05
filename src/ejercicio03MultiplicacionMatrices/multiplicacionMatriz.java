package ejercicio03MultiplicacionMatrices;

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
public class multiplicacionMatriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas de A: ");
        int filasA = teclado.nextInt();
        System.out.print("Ingrese cantidad de columnas de A (esto será también las filas de B): ");
        int columnasA = teclado.nextInt();
        System.out.print("Ingrese cantidad de columnas de B: ");
        int columnasB = teclado.nextInt();

        double[][] matrizA = new double[filasA][columnasA];
        double[][] matrizB = new double[columnasA][columnasB];
        double[][] matrizC = new double[filasA][columnasB];

        // Se leen los elementos de la matriz A
        System.out.println("Ingrese elementos de la matriz A:");
        System.out.println("numero [decimal(,)/ entero];");
        for (int fila = 0; fila < filasA; fila++) {
            for (int columna = 0; columna < columnasA; columna++) {
                System.out.print("Valor en [fila " + (fila+1) + ", columna " + (columna+1) + "]: ");
                matrizA[fila][columna] = teclado.nextDouble();
            }
        }

        // Se leen los elementos de la matriz B
        System.out.println("Ingrese elementos de la matriz B:");
        System.out.println("numero [decimal(,)/ entero];");
        for (int fila = 0; fila < columnasA; fila++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.print("Valor en [fila " + (fila+1) + ", columna " + (columna+1) + "]: ");
                matrizB[fila][columna] = teclado.nextDouble();
            }
        }

        // Se realiza la multiplicación de matrices
        for (int fila = 0; fila < filasA; fila++) {
            for (int columna = 0; columna < columnasB; columna++) {
                matrizC[fila][columna] = 0;
                for (int k = 0; k < columnasA; k++) {
                    matrizC[fila][columna] += matrizA[fila][k] * matrizB[k][columna];
                }
            }
        }

        // Se muestra la operación paso a paso
        System.out.println("\nOperación (A * B):");
        for (int fila = 0; fila < filasA; fila++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.print("(");
                for (int k = 0; k < columnasA; k++) {
                    System.out.print(matrizA[fila][k] + " * " + matrizB[k][columna]);
                    if (k < columnasA - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.print(") ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Se muestran las matrices
        System.out.println("\nMatriz A:");
        for (int fila = 0; fila < filasA; fila++) {
            for (int columna = 0; columna < columnasA; columna++) {
                System.out.printf("%6.2f ", matrizA[fila][columna]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int fila = 0; fila < columnasA; fila++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.printf("%6.2f ", matrizB[fila][columna]);
            }
            System.out.println();
        }

        System.out.println("\nResultado de la multiplicación (Matriz C):");
        for (int fila = 0; fila < filasA; fila++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.printf("%6.2f ", matrizC[fila][columna]);
            }
            System.out.println();
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
