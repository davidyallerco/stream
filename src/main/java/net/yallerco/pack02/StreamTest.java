package net.yallerco.pack02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * filter y map son intermedios y reduce es el final
 */
public class StreamTest {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //usando stream
        Stream<Integer> numStream = numeros.stream();
        int suma = numStream
                .filter(n -> n % 2 == 1)//{1,3,5} solo impares
                .map(n -> n*n) //{1,9,25} en cada iteracion hace n*n
                .reduce(0, Integer::sum);

        System.out.println("La suma de impares es: " + suma);
    }
}