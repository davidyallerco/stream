
package pack02crearStream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Stream a partir de valores
 */
public class StreamTest03 {
    
    public static void main(String[] args) {
        
        //devolver los primeros diez numeros
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n +1) //1L empieza en 1
                .limit(10);
        primerosDiez.forEach(System.out::println);
        
        
        //devolver los numeros pares
        Stream.iterate(1L, n -> n + 1) //el segundo parametro de tipo unaryoperator
                .filter(n -> n % 2 == 0) //devuelve pares
                .limit(20) //limitamos a 20
                .forEach(System.out::println);
        
        
        //usando intermediaSkip
        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(100)//los primeros 100 elemento generado se saltara, no los considera
                .limit(5)
                .forEach(System.out::println);
        
        
        //generando aleatorios
        System.out.println("Números aleatorios");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        
        
        //generar entero infinitos
        System.out.println("Generar enteros ");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
        
    }
}
