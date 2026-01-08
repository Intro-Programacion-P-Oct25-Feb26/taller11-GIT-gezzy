/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salida;
        System.out.printf("Ingrese la operacion que desee:"
                + "\n1 para obtener área de un cuadrado,"
                + "\n2 para obtener el área de un triángulo,"
                + "\n3 para obtener el área de un rectángulo.\n");
        salida = entrada.nextInt();
        if (salida == 1 || salida == 2 || salida == 3) {
            if (salida == 1) {
                obtenerAreaCuadrado();
            } else if (salida == 2) {
                obtenerAreaTriangulo();
            } else if (salida == 3) {
                obtenerAreaRectangulo();
            }
        } else {
            System.out.println("La opcion ingresada es incorrecta");
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        int resultado;
        System.out.println("Ingrese el lado del cuadrado:");
        lado = entrada.nextInt();
        resultado = lado * lado;
        System.out.printf("El area del cuadrado de lado %s es: %s\n",
                lado, resultado);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int resultado;
        System.out.println("Ingrese la base del Triangulo:");
        base = entrada.nextInt();
        System.out.println("Ingrese la base del Triangulo:");
        altura = entrada.nextInt();
        resultado = (base * altura) / 2;
        System.out.printf("El area del Triangulo de base %s y de altura %s es: %s\n",
                base, altura, resultado);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int resultado;
        System.out.println("Ingrese la base del Rectangulo:");
        base = entrada.nextInt();
        System.out.println("Ingrese la base del Rectangulo:");
        altura = entrada.nextInt();
        resultado = base * altura;
        System.out.printf("El area del Rectangulo de base %s y de altura %s es: %s\n",
                base, altura, resultado);
    }

}
