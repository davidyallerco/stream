package pack07map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * map siempre devuelve un valor el foreach es void
 */
public class Ejemplo03Filter {

    public static void main(String[] args) {

        //caso1
        Stream<Usuario> nombres = Stream
                .of("Luis Andia", "Paolo Guerrero", "Raquel Yallerco", "Rosa Salas","Paolo Rivas")
                .map(dato -> new Usuario(dato.split(" ")[0], dato.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Paolo"))
                .peek(System.out::println);
                

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //..nos ayudamos de el metodo tostring
    }
}
