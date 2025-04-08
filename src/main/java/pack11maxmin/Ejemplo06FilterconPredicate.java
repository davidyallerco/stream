
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
public class Ejemplo06FilterconPredicate {
    
    
    public static void main(String[] args) {
     
      List<Empleado> empleados = Empleado.empleados();
      
       //caso 1
        System.out.println("\n Personal femenino mayor de 25 años " +
                 " ocn ingresos por encima de los 300");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empMayor25 = emp -> emp.getEdad()>25;
        Predicate<Empleado> empIngresos300 = emp -> emp.getIngresos()> 300;
        Predicate<Empleado> fem25300 = empFemenino.and(empMayor25).and(empIngresos300);
        
        empleados
                .stream()
                .filter(fem25300)
                .forEach(emp -> 
                        System.out.println(emp.getNombre()+ " " + emp.getGenero()+
                                " " + emp.getIngresos()));
        System.out.println("Cantidad Total: " + empleados.stream().filter(fem25300).count());
        
        
      
       
    }
    
    
    
     
    
    
}
