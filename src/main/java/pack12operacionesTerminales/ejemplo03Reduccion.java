package pack12operacionesTerminales;

import java.util.List;
import pack11maxmin.Empleado;

/**
 *
 * @author smart10
 */
public class ejemplo03Reduccion {

    public static void main(String[] args) {
        
        
        int[] numeros = {2, 4, 6, 7, 23, 26, 56, 78, 3, 16, 86, 99, 11};
        
        //suma de manera tradicional
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);
        
        
        //promedio de manera tradicional
        double promedio = suma/ numeros.length;
        System.out.println("El promedio es: " + promedio);
        
        //cuenta de elementos tradicional
        System.out.println("Cantidad de elementos: "+ numeros.length);
        
        //obtener el maximo
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El máximo es: " + maximo);
        //obtener el minimo
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("El minimo es: " + minimo);
        
        //
        System.out.println("\n Operacion de reduccion con empleados");
        List<Empleado> empleados = Empleado.empleados();
        //suma de salarios
        double sumaSalarios = 0.0;
        for (Empleado empleado : empleados) {
            sumaSalarios += empleado.getIngresos();
        }
        System.out.println("La suma de salarios es: " + sumaSalarios);
        
        //cantidad de empleados
        System.out.println("Cantidad de empleados es: " + empleados.size());
        
        //obtener el empleado con el salario maximo
        Empleado empMaximo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getIngresos() > empMaximo.getIngresos()) {
                empMaximo = empleado;
            }
        }
        System.out.println("Empleado con el maximo salario: " +
                empMaximo.getNombre() + " " + empMaximo.getIngresos());
    }
    
}
