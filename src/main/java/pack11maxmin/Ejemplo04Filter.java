
package pack11maxmin;


import static java.util.Arrays.stream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pack03.DataBase;
import pack03.VideoJuego;

/**
 *
 * @author smart10
 */
public class Ejemplo04Filter {
    
    
    public static void main(String[] args) {
      //caso 1 este es con clase anonima
      List<Empleado> empleados = Empleado.empleados();
      
        System.out.println("Empleados hombres: ");
        empleados
                .stream()
                .filter(new Predicate<Empleado>(){
                    @Override
                    public boolean test(Empleado emp){
                        return emp.esHombre();
                    }
                })
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getGenero()));
        
        //caso 2 con expresion lambda
        System.out.println("\nEmpleados que son mujeres \n");
        empleados
                .stream()
                .filter(Empleado::esMujer)
                .forEach(emp -> System.out.println(emp.getNombre()+ " " + emp.getEdad()));
        
        //caso 3
        System.out.println("\nEmpleados que son mujeres mayores de 25 años \n");
        empleados
                .stream()
                .filter(Empleado::esMujer)
                .filter(e -> e.getEdad()> 25)
                .forEach(e -> System.out.println(e.getNombre() + " " + e.getEdad()));
        
         //caso 4
        System.out.println("\nEmpleados Masculino cuyo nombre empiece con la letra A\n");
        empleados
                .stream()
                .filter(Empleado::esHombre)
                .filter(e -> e.getNombre().startsWith("A"))
                .forEach(e -> System.out.println(e.getNombre() ));
        
        
         //caso 5
        System.out.println("\nEmpleados Masculino que gane mas de 500 \n");
        empleados
                .stream()
                .filter(emp -> emp.esHombre() && emp.getIngresos() > 500)
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));
    }
    
    
    
     
    
    
}
