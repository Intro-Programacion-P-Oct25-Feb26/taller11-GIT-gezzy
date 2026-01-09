/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media = mediaAritmetica(informacion);
        double desviacion = desviacionEstandar(informacion, media);
        System.out.printf("El valor de la Media Aritmetica del arreglo es: %.0f\n"
                + "El valor de la Desviacion Estandar del arreglo es: %.2f\n",
                media, desviacion);
    }

    public static double mediaAritmetica(int info[]) {
        double suma = 0;
        double promedio;
        for (int i = 0; i < info.length; i++) {
            suma = suma + info[i];
        }
        promedio = suma / 9;
        return promedio;
    }

    public static double desviacionEstandar(int info[], double promedio) {
        double suma = 0;
        double valor;
        double total;
        for (int i = 0; i < info.length; i++) {
            valor = info[i] - promedio;
            suma = suma + Math.pow(valor, 2);
        }
        total = Math.sqrt(suma / 9);
        return total;
    }
}
