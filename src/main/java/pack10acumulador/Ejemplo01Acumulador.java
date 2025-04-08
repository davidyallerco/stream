
package pack10acumulador;

import static java.util.Arrays.stream;
import java.util.Optional;
import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class Ejemplo01Acumulador {
    
    
    public static void main(String[] args) {
        
        //devuelve todos aquellos con descuento
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        reduceOperator(videoJuego);
        
        //devuelve sin descuento
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        reduceOperator2(videoJuego2);
    }
    
    
    static void reduceOperator(Stream<VideoJuego> stream){
        Optional<Integer> r = stream
                .filter(VideoJuego::getTieneDescuento)
                .map(VideoJuego::getTotalVendido)
                .reduce(Integer::sum);
        System.out.println(r);
    }
    
     static void reduceOperator2(Stream<VideoJuego> stream){
        Optional<Integer> r = stream
                .filter(v -> !v.getTieneDescuento())
                .map(VideoJuego::getTotalVendido)
                .reduce(Integer::sum);
        System.out.println(r);
    }
    
    
    
}
