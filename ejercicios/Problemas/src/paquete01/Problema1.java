/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int datos[][]) {
        String mensaje = "";
        int valor;
        for (int i = 0; i < datos.length; i++) {
            for (int c = 0; c < datos.length; c++) {
                valor = datos[i][c];
                if (valor % 2 == 0) {
                    mensaje = String.format("%s\t%s", mensaje, valor);
                }
            }
        }
        System.out.printf("Los valores pares del arreglo son: %s\n", mensaje);
    }
}
