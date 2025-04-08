
package pack11maxmin;


import java.util.Arrays;
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
 * ordenar
 */
public class Ejemplo14sort {
    
    
    public static void main(String[] args) {
        
        System.out.println("Nombres ordenados: ");
        Arrays.asList("David","Juan", "Mario","Zoila","Anita")
                .stream()
                .sorted()
                .forEach(System.out::println);
        
        System.out.println("Numeros ordenados: ");
        Arrays.asList(1,4,6,8,9,3,4,5,2,4,2,1,5)
                .stream()
                .sorted()
                .forEach(System.out::println);
        
        System.out.println("Empleados ordenados por nombre alfabeticamente: ");
        List<Employee> empleados = Employee.empleados();
        
        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));
        
        
        System.out.println("Ordenar Empleados por su edad: \n -----------------------------");
        empleados.stream()
                .sorted(new Comparator<Employee>(){
                    @Override
                    public int compare(Employee emp1, Employee emp2){
                        return emp1.getEdad() - emp2.getEdad();
                    }
                })
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));
        
        System.out.println("Ordenar Empleados por su Salario: \n -----------------------------");
        empleados.stream()
                .filter(emp -> emp.getEdad()>25)
                .sorted((emp1, emp2) ->
                    (int)(emp1.getIngresos() - emp2.getIngresos()))
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));
    }
    
   
    
    
     
    
     
    
    
}
