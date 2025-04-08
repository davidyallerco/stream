
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
 * peek es un operador intermedi y no se ejecuta si no hay un operador final
 * el peek es parecido a foreach
 */
public class Ejemplo08peek {
    
    
    public static void main(String[] args) {
        
        
        Stream<VideoJuego> videoJuego2 = DataBase.videogames.stream();
        peekOperador2(videoJuego2);
        
        System.out.println("------------------");
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        peekOperador(videoJuego);
        
        
        
        
        
    }
    
    
    static void peekOperador2(Stream<VideoJuego> stream){
        stream.peek(System.out::println).collect(Collectors.toList());
    }
    
    
    //todos los nombre estan en vacio
    static void peekOperador(Stream<VideoJuego> stream){
        stream.peek(v -> v.setNombre("")).forEach(System.out::println);
    }
    
    
     
    
     
    
    
}
