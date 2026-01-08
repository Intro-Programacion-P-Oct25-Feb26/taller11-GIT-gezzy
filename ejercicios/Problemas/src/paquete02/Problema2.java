/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String viviendas[];
        double consumoMensual[][];
        double consumoAnual[];
        viviendas = listadoViviendas();
        consumoMensual = obtenerConsumoMensual(viviendas);
        consumoAnual = obtenerConsumoAnual(consumoMensual);
        presentarInformacion(viviendas, consumoAnual);
    }

    public static String[] listadoViviendas() {
        Scanner entrada = new Scanner(System.in);
        String viviendas[] = new String[10];
        String nombre;
        for (int i = 0; i < viviendas.length; i++) {
            System.out.printf("Ingrese el nombre o no. de la vivienda %s:\n", i + 1);
            nombre = entrada.nextLine();
            viviendas[i] = nombre;
        }
        return viviendas;
    }

    public static double[][] obtenerConsumoMensual(String nombres[]) {
        Scanner entrada = new Scanner(System.in);
        double consumoMes[][] = new double[10][12];
        double consumo;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("Ingrese el consumo electrico de la vivienda "
                        + "%s en el mes %s:\n", nombres[i], j + 1);
                consumo = entrada.nextDouble();
                consumoMes[i][j] = consumo;
            }
        }
        return consumoMes;
    }

    public static double[] obtenerConsumoAnual(double consumoMes[][]) {
        double consumoAnual[] = new double[10];
        double suma;
        for (int i = 0; i < 10; i++) {
            suma = 0;
            for (int j = 0; j < 12; j++) {
                suma = suma + consumoMes[i][j];
            }
            consumoAnual[i] = suma;
        }
        return consumoAnual;
    }

    public static void presentarInformacion(String viviendas[], double consumoMes[]) {
        String mensaje = "";
        for (int i = 0; i < 10; i++) {
            mensaje = String.format("%sConsumo anual de la vivienda %s: %s (kWh)\n",
                     mensaje, viviendas[i], consumoMes[i]);
        }
        System.out.printf("\tListado de consumo anual del Recinto:\n%s", mensaje);
    }
}

