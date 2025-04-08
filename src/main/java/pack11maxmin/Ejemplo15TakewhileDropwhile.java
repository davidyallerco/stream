
package pack11maxmin;


import static java.util.Arrays.stream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * ordenar , takeWhile y dropWhile funciona con java 9
 * en su mayoria de casos para se necesita previamente un ordenar (sorted)
 */
public class Ejemplo15TakewhileDropwhile {
    
    
    public static void main(String[] args) {
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        obtenerNombresAntesDeM(videoJuego);
        
        System.out.println("--------------");
        
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        obtenerNombresDesdeDeM(videoJuego2);
    }
    
    
    static void obtenerNombresAntesDeM(Stream<VideoJuego> stream){
        List<VideoJuego> r = stream
                .sorted(Comparator.comparing(VideoJuego::getNombre))
                //.takeWhile(v -> !v.getNombre().startsWith("M"))//java 9+
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }
    
    static void obtenerNombresDesdeDeM(Stream<VideoJuego> stream){
        List<VideoJuego> r = stream
                .sorted(Comparator.comparing(VideoJuego::getNombre))
                //.dropWhile(v -> !v.getNombre().startsWith("M"))//java 9+
                .collect(Collectors.toList());
        r.forEach(System.out::println);
    }
    
   
    
    
     
    
     
    
    
}
