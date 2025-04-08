package pack01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author smart10
 */
public class EjemploStream {

    public static void main(String[] args) {
        System.out.println("---caso 1 ---");
        Stream<String> nombres = Stream.of("David", "Ezer", "Daniel", "Dionisio", "Daniela");
        nombres.forEach(System.out::println);

        System.out.println("---caso 2 ---");
        String[] arreglo = {"David", "Ezer", "Daniel", "Dionisio", "Daniela"};
        Stream<String> nombres2 = Arrays.stream(arreglo);
        nombres2.forEach(System.out::println);

        System.out.println("---caso 3 ---");
        Stream<String> nombres3 = Stream.<String>builder()
                .add("Maria")
                .add("Mariela")
                .add("Mario")
                .add("Monica")
                .build();
        nombres3.forEach(System.out::println);

        //caso 4 stream a partir de una coleccion
        System.out.println("---caso 4 ---");
        List<String> lista = new ArrayList<>();
        lista.add("Ramiro");
        lista.add("Raquel");
        lista.add("Rita");
        lista.add("Rolando");
        lista.add("Roberto");
        Stream<String> nombres4 = lista.stream();
        nombres4.forEach(System.out::println);

        //caso 5 stream a partir de una coleccion, al final cambia
        System.out.println("---caso 5 ---");
        List<String> lista2 = new ArrayList<>();
        lista2.add("Lola");
        lista2.add("Lenonardo");
        lista2.add("Luis");
        lista2.add("Lucas");
        lista2.add("Lalo");
        lista2.stream().forEach(System.out::println);
    }
}
