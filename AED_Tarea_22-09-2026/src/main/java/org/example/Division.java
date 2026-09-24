package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Division {
    public static void main(String[] args) {
        //División
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresa el númerador: ");
            int numerador = sc.nextInt();
            System.out.println("Ingresa el denominador: ");
            int denominador = sc.nextInt();
            int resultado = numerador / denominador;
            System.out.println("Tu resultado es: " + resultado);
        }  catch (ArithmeticException e) {
            System.out.println("No es posible dividir por 0");
        } catch (InputMismatchException e) {
            System.out.println("Ingresa un número, no una letra");
        }
        //Conversión
        System.out.println("Conversión de valores del Array:");
       String[] array = {"100","250","30A","400","XYZ"};
        for (int i = 0; i < array.length; i++) {
            try {
                System.out.println(Integer.parseInt(array[i]));
            } catch (NumberFormatException e) {
                System.out.println("Error de formato de número en índice: " + i);
            }
        }
        //Creación de Ficheros
        System.out.println("Creación de fichero:");
        File fichero = new File("~/Trabajos/carpeta_inexistente/documento.txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Resolución de rutas
        System.out.println("Resolución de ruta: ");
        File redundante = new File("./doc_redundante.txt");
        try {
            String ruta = redundante.getCanonicalPath();
            System.out.println(ruta);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inspección terminada");
        }
    }
}