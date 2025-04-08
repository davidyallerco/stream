
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
 * ordenar
 */
public class Ejemplo13sort {
    
    
    public static void main(String[] args) {
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        ordenarListaReviews(videoJuego);
    }
    
    
    static void ordenarListaReviews(Stream<VideoJuego> stream){
        List<VideoJuego> listaOrdenada = stream
                .sorted(Comparator.comparingInt(v -> v.getReviews().size()))
                .collect(Collectors.toList());
        //System.out.println(listaOrdenada);
        listaOrdenada.forEach(System.out::println);
    }
    
   
    
    
     
    
     
    
    
}
