/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        // 

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] arregloResultante = llenarMatriz(informacion, informacion2);
        String cadena = "";
        for (int i = 0; i < arregloResultante.length; i++) {
            for (int j = 0; j < arregloResultante[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arregloResultante[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }

    public static int[][] llenarMatriz(int a[][], int b[][]) {
        int resultado[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
}
