
package pack03;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author smart10
 */
public class ConstructorStreams {
    
    public static void main(String[] args) {
        
        Stream<VideoJuego> myStream = DataBase.videogames.stream();
        System.out.println(myStream);
        myStream.forEach(System.out::println);
        
        //arreglo tradicional
        System.out.println("-----------");
        Integer[] myArray = {1,2,3,4,5,6,7,8,9,10};
        Stream<Integer> intStream = Arrays.stream(myArray);
        intStream.forEach(System.out::println);
        
        //forma arbitraria
        System.out.println("-----------");
        Stream.of("uno","dos","tres","cuatro","cinco").forEach(System.out::println);
        
        System.out.println("-----------");
        DoubleStream myDoubleStream = DoubleStream.of(20.3,30.2,0.0);
        myDoubleStream.forEach(System.out::println);
    }
}
