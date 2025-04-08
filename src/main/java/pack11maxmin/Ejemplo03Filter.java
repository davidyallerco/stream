
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
public class Ejemplo03Filter {
    
    
    public static void main(String[] args) {
        
        //mostrar los mayores a 5
        //filtrar que no este en descuento
        //que contenga la palabra "forza"
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        filtrar(videoJuego);
    }
    
    
    static void filtrar(Stream<VideoJuego> stream){
        List<VideoJuego> r = stream
                .filter(v -> v.getPrecio()> 5)
                .filter(v -> !v.getTieneDescuento())
                .filter(v -> v.getSitioWebOficial().contains("forza"))
                .collect(Collectors.toList());
        
        r.forEach(System.out::println);
    }
    
     
    
    
}
