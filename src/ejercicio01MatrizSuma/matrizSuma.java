package ejercicio01MatrizSuma;

import java.util.Scanner;

/**
 * Clase matrizSuma.
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
 * @author Cristian Alexis Lucio Narvaéz
 */
public class matrizSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        int cantidadFilas = teclado.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int cantidadColumnas = teclado.nextInt();

        double[][] matrizA = new double[cantidadFilas][cantidadColumnas];
        double[][] matrizB = new double[cantidadFilas][cantidadColumnas];
        double[][] matrizC = new double[cantidadFilas][cantidadColumnas];

        // Se leen los elementos de la matriz A
        System.out.print("Ingrese elementos de la matriz A: ");
        System.out.println("numero [decimal(,)/ entero];");
        for (int indiceFila = 0; indiceFila < cantidadFilas; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                System.out.print("Valor en [fila " + (indiceFila+1) 
                + ", columna " + (indiceColumna+1) + "]: ");
                matrizA[indiceFila][indiceColumna] = teclado.nextDouble();
            }
        }

        // Se leen los elementos de la matriz B
        System.out.print("Ingrese elementos de la matriz B: ");
        System.out.println("numero [decimal(,)/ entero];");
        for (int indiceFila = 0; indiceFila < cantidadFilas; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                System.out.print("Valor en [fila " + (indiceFila+1) 
                + ", columna " + (indiceColumna+1) + "]: ");
                matrizB[indiceFila][indiceColumna] = teclado.nextDouble();
            }
        }

        // Se suman las dos matrices
        System.out.println("\nOperación (A + B):");
        for (int indiceFila = 0; indiceFila < cantidadFilas; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                matrizC[indiceFila][indiceColumna] 
                = matrizA[indiceFila][indiceColumna] + matrizB[indiceFila][indiceColumna];

                // Mostrar la operación paso a paso
                System.out.print("(" + matrizA[indiceFila][indiceColumna] 
                + " + " + matrizB[indiceFila][indiceColumna] + ") ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Se muestra la matriz resultante
        System.out.println("\nMatriz A   +   Matriz B   =   Matriz C");
        for (int indiceFila = 0; indiceFila < cantidadFilas; indiceFila++) {
            // Imprimir fila de A
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                System.out.printf("%6.2f ", matrizA[indiceFila][indiceColumna]);
            }

            System.out.print("   +   ");

            // Imprimir fila de B
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                System.out.printf("%6.2f ", matrizB[indiceFila][indiceColumna]);
            }

            System.out.print("   =   ");

            // Imprimir fila de C
            for (int indiceColumna = 0; indiceColumna < cantidadColumnas; indiceColumna++) {
                System.out.printf("%6.2f ", matrizC[indiceFila][indiceColumna]);
            }

            System.out.println(); // salto de línea al terminar cada fila
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
