package pack12operacionesTerminales;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import pack11maxmin.Empleado;

/**
 *
 * con Programacion funcional,ojo la enterior es sin programacion funcional
 */
public class ejemplo04Reduccion {

    public static void main(String[] args) {

        int[] numeros = {2, 4, 6, 7, 23, 26, 56, 78, 3, 16, 86, 99, 11};

        List<Empleado> empleados = Empleado.empleados();

        //suma de manera tradicional
        System.out.println("Suma es:"
                + IntStream.of(numeros).sum());
        //promedio
        System.out.println("Promedio "
                + IntStream.of(numeros).average().getAsDouble());//average es opcionalDouble
        //obtener el maximo y minimo
        System.out.println("El valor maximo es: "
                + IntStream.of(numeros).max().getAsInt());
        System.out.println("El valor minimo es : "
                + IntStream.of(numeros).min().getAsInt());
        //cantidad de elmentos
        System.out.println("Cantidad de elementos: "
                + IntStream.of(numeros).count());
        //Operaciones con empleados
        //sumar los salarios de todos los empleados
        System.out.println("Operaciones con empleados y streams");
        System.out.println("Suma de salarios: "
                + empleados
                        .stream()
                        .mapToDouble(Empleado::getIngresos)
                        .sum());

        //obtener el empleado co el salario maximo
        Empleado empMax = empleados
                .stream()
                .max(
                        (emp1, emp2)
                        -> (int) (emp1.getIngresos() - emp2.getIngresos()))
                .get();
        System.out.println("Empleado maximo salario " +
                empMax.getNombre() + ": " + empMax.getIngresos());
    }

}
