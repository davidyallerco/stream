
package pack11maxmin;


import static java.util.Arrays.stream;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class Ejemplo01MaxMin {
    
    
    public static void main(String[] args) {
        
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        maxOperator(videoJuego);
        
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        minOperator(videoJuego2);
        
    }
    static void maxOperator(Stream<VideoJuego> stream){
        Optional<VideoJuego> r = stream.max(Comparator.comparing(VideoJuego::getNombre));
        System.out.println(r.get().getNombre());
    }
    
    static void minOperator(Stream<VideoJuego> stream){
        Optional<VideoJuego> r = stream.min(Comparator.comparing(VideoJuego::getNombre));
        System.out.println(r.get().getNombre());
    }
    
     
    
    
}
