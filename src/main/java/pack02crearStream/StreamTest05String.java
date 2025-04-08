
package pack02crearStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * Stream a partir de valores
 */
public class StreamTest05String {
    
    public static void main(String[] args) {
        
       // Scanner scanner = new Scanner(System.in);
        //String entrada = scanner.nextLine();
        String entrada = "abcd";
        
        IntStream streamChars = entrada.chars();
        streamChars.forEach(System.out::println);//que numero pertenece a cada caracter
        
        //filtramos los espacios en blanco
        IntStream streamChars2 = entrada.chars();
        streamChars2.filter(n -> !Character.isDigit((char)n)
                && !Character.isWhitespace((char)n))
                .forEach(n -> System.out.println((char)n));
       
        
        String cadena = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(", ")
                .splitAsStream(cadena)
                .forEach(System.out::println);
    }
}
