import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        File directorioActual = new File(".");
        if (directorioActual.exists() && directorioActual.isDirectory()) {
            File [] ficheros = directorioActual.listFiles();
            for (File fichero : ficheros) {
                if (fichero.isDirectory()) {
                    System.out.println("[DIR] " + fichero.getName());
                } else if (fichero.isFile()) {
                    System.out.println("[FICHERO] " + fichero.getName());
                }
            }
        }
        //Ejercicio 2
        File copiasSeguridad = new File("./copias_seguridad");
        File datos = new File("./copias_seguridad/datos_v1.txt");
        File datosFinal = new File("./copias_seguridad/datos_final.txt");
        try {
            if (!(copiasSeguridad.exists())) {
                copiasSeguridad.mkdir();
            } else {
                datos.createNewFile();
            }
            if (datos.exists()) {
                datos.renameTo(datosFinal);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Ejercicio 3
        File temp = new File("./temp");
        File temporal = new File ("./temp/temporal.txt");
        try {
            temp.mkdir();
            temporal.createNewFile();
            if (temporal.exists()) {
                temporal.delete();
                System.out.println("Archivo temporal eliminado");
            }
            if (!(temporal.exists())) {
                temp.delete();
                System.out.println("Carpeta temporal eliminado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
