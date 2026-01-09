/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String ciudades[] = llenarArreglo();
        presentarInfo(ciudades);
    }

    public static String[] llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        System.out.println("Ingrese el tamaño del arreglo:");
        int indice = entrada.nextInt();
        entrada.nextLine();
        String ciudades[] = new String[indice];
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("Ingrese el nombre de una cudad del Ecuador para "
                    + "el arreglo creado en posicion %s:\n", i);
            ciudad = entrada.nextLine();
            ciudades[i] = ciudad;
        }
        return ciudades;
    }

    public static void presentarInfo(String arreglo[]) {
        String mensaje = "";
        String cadena;
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            cadena = arreglo[i];
            if (cadena.length() == 4 || cadena.length() == 5) {
                contador = contador + 1;
                mensaje = String.format("%s\t%s", mensaje, cadena);
            } else if (contador == 0) {
                mensaje = "No existen valores que contengan 4 o 5 caracteres "
                        + "dentro del arreglo.";
            }
        }
        System.out.printf("\n%s\n", mensaje);
    }
}
