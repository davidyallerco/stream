
package pack02crearStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Stream a partir de valores
 */
public class StreamTest06Archivos {
    
    public static void main(String[] args) {
        
        Path path1 = Paths.get("archivoejemplo.txt");
        try (Stream<String> lineas = Files.lines(path1)){
            lineas.forEach(
                    linea -> {
                        System.out.println("Linea..");
                        System.out.println(linea);
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
