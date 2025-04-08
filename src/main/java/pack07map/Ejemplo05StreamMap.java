package pack07map;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pack03.BasicoVideoJuego;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * por ejemplo estamos reduciento de videjuego que tiene varios atributos a bacicoVideoJuego
 * que tiene solo tres atributos (convertimos)
 */
public class Ejemplo05StreamMap {

    public static void main(String[] args) {
        
        Stream<VideoJuego> videoJuego = DataBase.videogames.stream();
        reducirMap(videoJuego);

    }
    
    
    static void reducirMap(Stream<VideoJuego> stream){
        List<BasicoVideoJuego> r = stream
                .map(v -> {
                    return BasicoVideoJuego.builder()
                            .nombre(v.getNombre())
                            .precio(v.getPrecio())
                            .consola(v.getConsola())
                            .build();
                }).collect(Collectors.toList());
        r.forEach(System.out::println);
    }
}
