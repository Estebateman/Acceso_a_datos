import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File ficheros = new File("./ficheros");
        if (!(ficheros.exists())) { ficheros.mkdir(); }
        // Ejercicio 1: Copia de un archivo binario mediante bloques de bytes
        // Ejercicio 2: Contador de bytes específicos en un archivo binario
        // Ejercicio 3: Escritura directa de texto y modo 'append'
        File notas = new File("./ficheros/notas.txt");
        try {
            if (!(notas.exists())) { notas.createNewFile(); }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            FileWriter escritor = new FileWriter(notas);
            String nota1 = sc.nextLine();
            escritor.write(nota1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        // Ejercicio 4: Lectura secuencial de caracteres y análisis de texto
    }
}
