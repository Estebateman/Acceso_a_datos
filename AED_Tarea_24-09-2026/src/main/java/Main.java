import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fichero = new File("src/main/java/documento.txt");
        Scanner sc = new Scanner(System.in);
        //Intento 1
        try {
            FileReader lectorBytes = new FileReader(fichero);
            BufferedReader lector = new BufferedReader(lectorBytes);
            System.out.println(lector.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /* Intento 2
        try {
            FileReader lectorBytes = new FileReader(fichero);
            while ((lectorBytes.read())!=-1) {
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } */
        //Escribir en el archivo
        try {
            FileWriter escribidorBytes = new FileWriter(fichero);
            BufferedWriter escribidor = new BufferedWriter(escribidorBytes);
            System.out.println("Escribe un verso poético:");
            String verso = sc.nextLine();
            escribidor.write(verso);
            escribidor.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
