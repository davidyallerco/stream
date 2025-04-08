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
 * comparando Map y flatMap
 * ver el total de reviews
 */
public class Ejemplo13MapYflatMap {

    public static void main(String[] args) {
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        totalReviewsMap(videoJuego);
        
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        totalReviewsFlatMap(videoJuego2);

    }
    
    
    static void totalReviewsMap(Stream<VideoJuego> stream){
        
        List<Integer> totalReviews = stream.map(v -> v.getReviews().size()).collect(Collectors.toList());
        System.out.println(totalReviews.size());
        //....en si no es 20 el resultado, se tendria que hacer mas carpinteria para sacar el valor real
        //...con flatmap es mejor 
    }
    
    static void totalReviewsFlatMap(Stream<VideoJuego> stream){
        
        Long totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(totalReviews);
        //....el valor real es 48
    }
}
