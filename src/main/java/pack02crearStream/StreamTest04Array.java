
package pack02crearStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Stream a partir de valores
 */
public class StreamTest04Array {
    
    public static void main(String[] args) {
        
        //caso 1
        IntStream numStream = Arrays.stream(new int[] {1,2,3,4,5,6});
        numStream.forEach(System.out::println);
        
        //caso 2
        Stream<String> nombres = Arrays.stream(new String[]{"David","Juan","Roberto"});
        nombres.forEach(System.out::println);
        
        
        //caso 3
        System.out.println("Ejemplo con Set");
        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("JAVA");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");
        Stream<String> lenguajeStream = lenguajesSet.stream();
        lenguajeStream.forEach(System.out::println);
        
        
        
        //caso 4 usando lista
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 34,23, 45));
        estudiantes.add(new Estudiante("David", 36,23, 45));
        estudiantes.add(new Estudiante("Carlos", 38,23, 45));
        estudiantes.add(new Estudiante("Jorge", 45,23, 45));
        
        System.out.println("Strem de estudiantes");
        Stream<Estudiante> estudianteStream = estudiantes.parallelStream();
        estudianteStream.forEach(e -> System.out.println(e.getIdentificacion()));
    }
}
