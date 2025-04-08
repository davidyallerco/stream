package pack07map;

import java.util.List;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import pack03.BasicoVideoJuego;
import pack03.DataBase;
import pack03.Review;
import pack03.VideoJuego;
import pack11maxmin.Empleado;

/**
 *
 * 
 */
public class Ejemplo11Map {

    public static void main(String[] args) {
        System.out.println("---1 al 5 con ...");
        IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int numero) {
                return numero * numero;
            }
            })
            .forEach(System.out::println);
        
        System.out.println("--- 1 al 10 con lambda");
        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);
        
        System.out.println("--- con Objeto empleados");
        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Promedio de ingresos de personal femenino mayo de 25");
        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad()>25)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();
        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad()> 25)
                .count();
        System.out.println("Promedio "+ promedio);
    }
    
    
}
