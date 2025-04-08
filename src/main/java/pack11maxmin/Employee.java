package pack11maxmin;

import java.util.Arrays;
import java.util.List;

/**
 *
 * para que un sorted(ordenamiento) pueda usar
 * es necesario que esta clase implemente Comparable
 * se crea el metodo comparable
 */
public class Employee implements Comparable{

    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public Employee() {
    }

    public Employee(long id, String nombre, double ingresos,  int edad,Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Employee)o).getNombre());
    }

    public static enum Genero {
        HOMBRE, MUJER
    }

    public boolean esHombre() {
        return this.genero == Genero.HOMBRE;
    }

    public boolean esMujer() {
        return this.genero == Genero.MUJER;
    }

    public static List<Employee> empleados() {
        Employee emp1 = new Employee(1, "Juan Perez", 538.00, 26, Genero.HOMBRE);
        Employee emp2 = new Employee(2, "Maria Garcia", 600.00, 32, Genero.MUJER);
        Employee emp3 = new Employee(3, "Carlos Sanchez", 750.00, 41, Genero.HOMBRE);
        Employee emp4 = new Employee(4, "Luisa Rodriguez", 500.00, 29, Genero.MUJER);
        Employee emp5 = new Employee(5, "Pedro Martinez", 650.00, 36, Genero.HOMBRE);
        Employee emp6 = new Employee(6, "Ana Ortiz", 480.00, 24, Genero.MUJER);
        Employee emp7 = new Employee(7, "Jorge Fernandez", 800.00, 45, Genero.HOMBRE);
        Employee emp8 = new Employee(8, "Laura Torres", 550.00, 28, Genero.MUJER);
        Employee emp9 = new Employee(9, "Miguel Gonzalez", 700.00, 39, Genero.HOMBRE);
        Employee emp10 = new Employee(10, "Lucia Hernandez", 520.00, 27, Genero.MUJER);
        Employee emp11 = new Employee(11, "Oscar Perez", 600.00, 33, Genero.HOMBRE);
        Employee emp12 = new Employee(12, "Carmen Garcia", 450.00, 23, Genero.MUJER);
        Employee emp13 = new Employee(13, "Fernando Rodriguez", 850.00, 48, Genero.HOMBRE);
        Employee emp14 = new Employee(14, "Isabel Martinez", 570.00, 31, Genero.MUJER);
        Employee emp15 = new Employee(15, "Ruben Sanchez", 680.00, 37, Genero.HOMBRE);
        Employee emp16 = new Employee(16, "Elena Ortiz", 500.00, 25, Genero.MUJER);
        Employee emp17 = new Employee(17, "Ramon Fernandez", 900.00, 50, Genero.HOMBRE);
        Employee emp18 = new Employee(18, "Lorena Torres", 600.00, 30, Genero.MUJER);
        Employee emp19 = new Employee(19, "Antonio Gonzalez", 750.00, 40, Genero.HOMBRE);
        Employee emp20 = new Employee(20, "Sofia Hernandez", 540.00, 26, Genero.MUJER);
        Employee emp21 = new Employee(21, "Hector Perez", 620.00, 34, Genero.HOMBRE);
        Employee emp22 = new Employee(22, "Raquel Garcia", 480.00, 22, Genero.MUJER);
        Employee emp23 = new Employee(23, "Pablo Rodriguez", 800.00, 43, Genero.HOMBRE);
        Employee emp24 = new Employee(24, "Natalia Martinez", 560.00, 29, Genero.MUJER);
        Employee emp25 = new Employee(25, "Luis Fernandez", 700.00, 38, Genero.HOMBRE);
        Employee emp26 = new Employee(26, "Sara Ortiz", 510.00, 27, Genero.MUJER);
        Employee emp27 = new Employee(27, "Andres Fernandez", 850.00, 46, Genero.HOMBRE);
        Employee emp28 = new Employee(28, "Claudia Torres", 590.00, 32, Genero.MUJER);
        Employee emp29 = new Employee(29, "Manuel Gonzalez", 720.00, 37, Genero.HOMBRE);
        Employee emp30 = new Employee(30, "Ana Maria Hernandez", 530.00, 25, Genero.MUJER);
        Employee emp31 = new Employee(31, "David Perez", 610.00, 33, Genero.HOMBRE);
        Employee emp32 = new Employee(32, "Eva Garcia", 470.00, 21, Genero.MUJER);
        Employee emp33 = new Employee(33, "Mariano Rodriguez", 820.00, 44, Genero.HOMBRE);
        Employee emp34 = new Employee(34, "Teresa Martinez", 550.00, 30, Genero.MUJER);

        return Arrays.asList(
                emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
                emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,
                emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
                emp31, emp32, emp33, emp34
        );

    }

}
