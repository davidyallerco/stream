package pack07map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * map siempre devuelve un valor el foreach es void
 */
public class Ejemplo02StreamMap {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream.of("Luis", "Paolo", "Raquel", "Rosa", "Luana")
                .map(nombre -> new Usuario(nombre, null))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

        //caso 2
        Stream<Usuario> names = Stream.of("Luis", "Paolo", "Raquel", "Rosa", "Luana")
                .map(name -> new Usuario(name, null))
                .peek(p -> System.out.println(p.getNombre()))
                .map(user -> {
                    String name = user.getNombre().toLowerCase();
                    user.setNombre(name);
                    return user;
                });

        List<Usuario> miLista = names.collect(Collectors.toList());
        miLista.forEach(p -> System.out.println(p.getNombre()));

        //caso3
        Stream<Usuario> datos = Stream
                .of("Luis Andia", "Paolo Guerrero", "Raquel Yallerco", "Rosa Salas")
                .map(dato -> new Usuario(dato.split(" ")[0], dato.split(" ")[1]))
                .peek(System.out::println)
                .map(user2 -> {
                    String dato = user2.getNombre().toUpperCase();
                    user2.setNombre(dato);
                    return user2;
                });

        List<Usuario> miLista2 = datos.collect(Collectors.toList());
        miLista2.forEach(System.out::println);
        //..nos ayudamos de el metodo tostring
    }
}
