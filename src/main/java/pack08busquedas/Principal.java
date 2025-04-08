
package pack08busquedas;

import java.util.Optional;
import pack06match.*;
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
        
        
        findFirstOperator(videoJuego);
        findAnyOperator(videoJuego2);
       
    }
   
    
     static void findFirstOperator(Stream<VideoJuego> stream){
         Optional<VideoJuego> r = stream.findFirst();
        System.out.println(r);
    }
     
     static void findAnyOperator(Stream<VideoJuego> stream){
         Optional<VideoJuego> r = stream.findAny();
        System.out.println(r);
    }
}
