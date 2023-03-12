package Streams.OperacionesReduccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Reducciones personalizadas
public class ImplementacionReduce {

    public static void main(String[] args) {
        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        int sum = IntStream.of(numeros).reduce(0, Integer::sum);
        //suma de los elementos
        System.out.println("La suma es: "+
                sum
        );

        Path path1 = Paths.get("./src/main/resources/parrafo.txt");
        String texto = "";

        try(Stream<String> lineas = Files.lines(path1)) {
        texto = lineas.map(linea -> linea.replace(",",""))
                    .reduce("",(linea1,linea2)->linea1.concat("\n").concat(linea2));
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/main/resources/parrafo2.txt"))){
            bw.write(texto);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
