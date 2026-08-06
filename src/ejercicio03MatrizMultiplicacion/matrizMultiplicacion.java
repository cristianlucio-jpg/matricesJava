package ejercicio03MatrizMultiplicacion;

import java.util.Scanner;

/**
 * Clase matrizMultiplicacion.
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
public class matrizMultiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas de A: ");
        int filasA = teclado.nextInt();
        System.out.print("Ingrese cantidad de columnas de A (filas de B): ");
        int columnasA = teclado.nextInt();
        System.out.print("Ingrese cantidad de columnas de B: ");
        int columnasB = teclado.nextInt();

        double[][] matrizA = new double[filasA][columnasA];
        double[][] matrizB = new double[columnasA][columnasB];
        double[][] matrizC = new double[filasA][columnasB];

       // Se leen los elementos de la matriz A
        for (int filaA = 0; filaA < filasA; filaA++) {
            for (int columnaA = 0; columnaA < columnasA; columnaA++) {
                System.out.print("Valor en [fila " + (filaA+1) + ", columna " + (columnaA+1) + "]: ");
                matrizA[filaA][columnaA] = teclado.nextDouble();
            }
        }

        // Se leen los elementos de la matriz B
        for (int filaB = 0; filaB < columnasA; filaB++) {
            for (int columnaB = 0; columnaB < columnasB; columnaB++) {
                System.out.print("Valor en [fila " + (filaB+1) + ", columna " + (columnaB+1) + "]: ");
                matrizB[filaB][columnaB] = teclado.nextDouble();
            }
        }

        // Multiplicación
        for (int filaC = 0; filaC < filasA; filaC++) {
            for (int columnaC = 0; columnaC < columnasB; columnaC++) {
                matrizC[filaC][columnaC] = 0;
                for (int indiceComun = 0; indiceComun < columnasA; indiceComun++) {
                    matrizC[filaC][columnaC] += matrizA[filaC][indiceComun] * matrizB[indiceComun][columnaC];
                }
            }
        }

        // Se muestra la operación paso a paso
        System.out.println("\nOperación (A * B):");
        for (int filaA = 0; filaA < filasA; filaA++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.print("(");
                for (int indiceComun = 0; indiceComun < columnasA; indiceComun++) {
                    System.out.print(matrizA[filaA][indiceComun] + " * " + matrizB[indiceComun][columna]);
                    if (indiceComun < columnasA - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.print(") ");
            }
            System.out.println(); // salto de línea al terminar cada filaA
        }

        // Se muestran las matrices
        System.out.println("\nMatriz A:");
        for (int filaA = 0; filaA < filasA; filaA++) {
            for (int columna = 0; columna < columnasA; columna++) {
                System.out.printf("%6.2f ", matrizA[filaA][columna]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int filaA = 0; filaA < columnasA; filaA++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.printf("%6.2f ", matrizB[filaA][columna]);
            }
            System.out.println();
        }

        System.out.println("\nResultado de la multiplicación (Matriz C):");
        for (int filaA = 0; filaA < filasA; filaA++) {
            for (int columna = 0; columna < columnasB; columna++) {
                System.out.printf("%6.2f ", matrizC[filaA][columna]);
            }
            System.out.println();
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
