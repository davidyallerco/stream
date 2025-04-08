package pack07map;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pack03.BasicoVideoJuego;
import pack03.DataBase;
import pack03.Review;
import pack03.VideoJuego;

/**
 *
 * pasar un lista de listas a un solo flujo (un stream),
 * para ello se necesita aplanar a un stream
 */
public class Ejemplo10flatMap {

    public static void main(String[] args) {
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        flatMap(videoJuego);

    }
    
    
    static void flatMap(Stream<VideoJuego> stream){
        
        List<Review> r = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        System.out.println(r);
    }
}
