
package pack02crearStream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Stream a partir de valores
 */
public class StreamTest02 {
    
    public static void main(String[] args) {
        
        Stream<String> stream1 = Stream.of("La vida es Bella");
        stream1.forEach(n -> System.out.println(n));
        
        
        Stream<String> stream2 = Stream.of("leche","arroz","fideos","azucar");
        stream2.forEach(n -> System.out.println(n));
        
        //a partir de un arreglo
        String[] arreglo = {"leche","arroz","fideos","azucar"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);
        
        //a partir de un objeto
        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
                .add(new Estudiante("n01",17,1.70,9.5))
                .add(new Estudiante("n02",21,1.70,9.5))
                .build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));
        //..resultado: n01 n02
        
        //a partir de enteros
        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
        unoAVeinte.forEach(System.out::println);
    }
}
