package Streams.Creacion;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CreacionStreamsDesdeArchivos {
    
    public static void main(String[] args) {
        Path path1 = Paths.get("./src/main/resources/parrafo.txt");

        try(Stream<String> lineas = Files.lines(path1)) {
            lineas.forEach(
                    linea -> {
                        System.out.println("Linea...");
                        System.out.println(linea);
                    }
            );
        } catch (Exception e){
            e.printStackTrace();
        }
        /* */
        System.out.println("");
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos " +
                "del proyecto para: " +
                "%s es %n ", dir.toAbsolutePath());

        try( Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
