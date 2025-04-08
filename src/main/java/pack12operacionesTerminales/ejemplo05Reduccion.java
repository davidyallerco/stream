package pack12operacionesTerminales;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import pack11maxmin.Empleado;

/**
 *
 * 
 */
public class ejemplo05Reduccion {
    
    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 7, 23, 26, 56, 78, 3, 16, 86, 99, 11};

       int suma = IntStream.of(numeros)
               .reduce(0, new IntBinaryOperator() { //reduce itera,en la primera left=0 y right=2
                                                //..en la segunda, despues de sumar left=2 y right=4
            @Override //ojo esto es con clase anonima
            public int applyAsInt(int left, int right) {
                return left + right;
            }
               });
        System.out.println("Con clase anonima La suma es: " + suma); 
        
        int suma2 = IntStream.of(numeros)
               .reduce(0,(num1, num2)-> Integer.sum(num1, num2));
        System.out.println("Con Stream La suma es: " + suma2); 
        
        //con metodos referenciados
        
        
        int suma3 = IntStream.of(numeros)
               .reduce(0,(Integer::sum));
        System.out.println("Con metodos referenciados La suma es: " + suma3); 
    }

}
