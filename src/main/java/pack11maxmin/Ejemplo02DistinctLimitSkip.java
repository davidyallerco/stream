
package pack11maxmin;


import static java.util.Arrays.stream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class Ejemplo02DistinctLimitSkip {
    
    
    public static void main(String[] args) {
        
        //mostrar no repetidos
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        datosNoRepetidos(videoJuego);
        
        //mostrar cinco primeros elementos
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        limiteCinco(videoJuego2);
        
        //saltar los 15 primeros elementos (omitir los 15 primeros)
        System.out.println("----------------------");
        Stream<VideoJuego> videoJuego3 = DataBase.videogames.stream();
        saltar(videoJuego3);
        
        
    }
    static void datosNoRepetidos(Stream<VideoJuego> stream){
        System.out.println(stream.distinct().count());
    }
    
    static void limiteCinco(Stream<VideoJuego> stream){
        List<VideoJuego> r = stream.limit(5).collect(Collectors.toList());
        //...con Collect lo pasamos a una lista
        r.forEach(System.out::println);
    }
    
    
    static void saltar(Stream<VideoJuego> stream){
        List<VideoJuego> r = stream.skip(15).collect(Collectors.toList());
        //...con Collect lo pasamos a una lista
        r.forEach(System.out::println);
    }
    
     
    
    
}
