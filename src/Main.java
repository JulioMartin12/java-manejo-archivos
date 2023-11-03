import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        String ruta = "F:\\presentacion.txt";
        readFile(ruta);
       // writeFile(ruta);
        // writeFilebyByte(ruta);
    }

    public  static void readFile(String ruta){
        try {
            for (String linea: Files.readAllLines(Paths.get(ruta))
            ) {
                System.out.println(linea);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  static void writeFile(String ruta){
String  textoAgregar = System.lineSeparator() + " Julio Martín";
        try {
            Files.writeString(Paths.get(ruta),textoAgregar, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public  static void writeFilebyByte(String path){
        String newText = System.lineSeparator() + " Se termino la presentación, Gracias por todo!!!";
        try {
            Files.write(Paths.get(path),newText.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}