/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salida;
        System.out.printf("Ingrese la opcion que desee:"
                + "\n1 para calcular el valor de la planilla de la luz,"
                + "\n2 para calcular el valor del predio de un bien inmueble.\n");
        salida = entrada.nextInt();
        if (salida == 1 || salida == 2) {
            entrada.nextLine();
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su no. de CI:");
            String cedula = entrada.nextLine();
            if (salida == 1) {
                calcularValorLuz(nombre, cedula);
            } else if (salida == 2) {
                calcularPredio(nombre, cedula);
            }
        } else {
            System.out.println("La opcion ingresada es incorrecta.");
        }
    }

    public static void calcularValorLuz(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costoKw;
        double cantidadKw;
        double costoTotal;
        System.out.println("Ingrese el valor a pagar por kilovatio:");
        costoKw = entrada.nextDouble();
        System.out.println("Ingrese la cantidad total de kilovatios consumidos "
                + "durante el mes:");
        cantidadKw = entrada.nextDouble();
        costoTotal = costoKw * cantidadKw;
        System.out.printf("%s con cedula %s debe cancelar el valor de $%s\n",
                n, c, costoTotal);
    }

    public static void calcularPredio(String n, String c) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double bienInmueble;
        double predio;
        System.out.println("Ingrese el valor de su bien inmueble:");
        bienInmueble = entrada.nextDouble();
        predio = bienInmueble * 0.02;
        System.out.printf("%s con cedula %s tiene un bien inmueble valorado en "
                + "$%s y tiene que pagar de predio $%s\n",
                n, c, bienInmueble, predio);
    }

}
