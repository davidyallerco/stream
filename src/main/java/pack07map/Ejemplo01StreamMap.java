
package pack07map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * map siempre devuelve un valor
 * el foreach es void
 */
public class Ejemplo01StreamMap {
    
    public static void main(String[] args) {
        
        System.out.println("--------caso 1 ---------");
        //caso 1 al final el foreach lo muestra
        Stream<String> nombres = Stream.of("David","Daniel","Dario","Domitila")
                .map(nombre ->{
            return nombre.toUpperCase();
        });
        nombres.forEach(System.out::println);
        
         //caso 2, no se puede porque map retorna y foreach es void
         /*
        Stream<String> nombres = Stream.of("David","Daniel","Dario","Domitila")
                .map(nombre ->{
            return nombre.toUpperCase();
        }).forEach(System.out::println);
        */
        
         System.out.println("--------caso 3 ---------");
         //caso 3 si se desea foreach seria asi
        Stream.of("David","Daniel","Dario","Domitila")
                .map(nombre ->{
            return nombre.toUpperCase();
        }).forEach(System.out::println);
        
        System.out.println("--------caso 4 ---------");
         //caso 4 con peek es como una inspeccion antes de ver el valor en mayuscula
        Stream<String> paises = Stream.of("Perú","Venezuela","Colombia","Brasil")
                .peek(e -> System.out.println(e))
                .map(pais ->{
            return pais.toUpperCase();
        });
        paises.forEach(System.out::println);
        
        System.out.println("--------caso 5 ---------");
         //caso 5 factorizando
        Stream<String> distritos = Stream.of("Comas","Miraflores","Surquillo","Surco")
                .peek(System.out::println)
                .map(String::toUpperCase);
        distritos.forEach(System.out::println);
        
        System.out.println("--------caso 6 ---------");
           //caso 6 pasar de string a List
        Stream<String> cursos = Stream.of("Matematica","Lenguaje","Arte","Biologia")
                .peek(System.out::println)
                .map(String::toUpperCase);
        List<String> lista = cursos.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}
