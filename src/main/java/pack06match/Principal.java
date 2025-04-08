
package pack06match;

import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class Principal {
     public static void main(String[] args) {
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        Stream<VideoJuego> videoJuego3 = DataBase.videogames.stream();
        
        anyMatchOperator(videoJuego);
        allMatchOperator(videoJuego2);
        noneMatchOperator(videoJuego3);
       
    }
    static void anyMatchOperator(Stream<VideoJuego> stream){
        boolean r = stream.anyMatch(v -> v.getTotalVendido() > 1000000);//si se vendio mas de 1 millon
        System.out.println(r);
    }
    
    static void allMatchOperator(Stream<VideoJuego> stream){
        boolean r = stream.allMatch(v -> v.getTotalVendido() > 150);
        System.out.println(r);
    }
    
     static void noneMatchOperator(Stream<VideoJuego> stream){
        boolean r = stream.noneMatch(v -> v.getReviews().isEmpty());
        System.out.println(r);
    }
}
