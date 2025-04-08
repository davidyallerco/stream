
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
public class StreamTest07Archivos {
    
    public static void main(String[] args) {
        
        Path dir = Paths.get(".");
        System.out.printf(
                "%n El arbol de archivos "
                + "del proyecto para: "
                + "%s es %n ", dir.toAbsolutePath()
        );
        try (Stream<Path> paths = Files.walk(dir)){
            paths.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
          
    }
}
