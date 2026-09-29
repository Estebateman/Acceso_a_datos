import java.io.*;
public class Recomponedor {
    public static void main(String[] args) {
        try {
            String nomFich = "./lib/recompon.txt";
            BufferedReader br = new BufferedReader(new FileReader(nomFich));
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich+".recomp.txt"));
                String linea;
                while ((linea = br.readLine()) != null) {
                        String[] oraciones = linea.split(".");
                        System.out.println(oraciones.getClass());
                        for (String oracion : oraciones) {
                            bw.write(oracion.stripLeading()+".");
                            bw.newLine();
                        }
                }
                br.close();
                bw.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERROR: indicar fichero.");
            }
    }
}
