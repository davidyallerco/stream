package pack07map;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * map siempre devuelve un valor el foreach es void
 */
public class Ejemplo04FilterUnico {

    public static void main(String[] args) {

        //caso1
        Stream<Usuario> nombres = Stream
                .of("Luis Andia", "Paolo Guerrero", "Raquel Yallerco", "Rosa Salas","Paolo Rivas")
                .map(dato -> new Usuario(dato.split(" ")[0], dato.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Paolo"));
                
                

        Optional<Usuario> usuario = nombres.findFirst();//findFirst es un operador final
        System.out.println(usuario.get());
        //..nos ayudamos de el metodo tostring
        
        
         //caso2
        Usuario user = Stream
                .of("Luis Andia", "Paolo Guerrero", "Raquel Yallerco", "Rosa Salas","Paolo Rivas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Paolo"))
                .findFirst().get();
        System.out.println(user);
                
                

    }
}
