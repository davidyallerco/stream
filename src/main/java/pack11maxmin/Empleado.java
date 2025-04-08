package pack11maxmin;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author CANVIA
 */
public class Empleado {

    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public Empleado() {
    }

    public Empleado(long id, String nombre, double ingresos,  int edad,Genero genero) {
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

    public static enum Genero {
        HOMBRE, MUJER
    }

    public boolean esHombre() {
        return this.genero == Genero.HOMBRE;
    }

    public boolean esMujer() {
        return this.genero == Genero.MUJER;
    }

    public static List<Empleado> empleados() {
        Empleado emp1 = new Empleado(1, "Juan Perez", 538.00, 26, Genero.HOMBRE);
        Empleado emp2 = new Empleado(2, "Maria Garcia", 600.00, 32, Genero.MUJER);
        Empleado emp3 = new Empleado(3, "Carlos Sanchez", 750.00, 41, Genero.HOMBRE);
        Empleado emp4 = new Empleado(4, "Luisa Rodriguez", 500.00, 29, Genero.MUJER);
        Empleado emp5 = new Empleado(5, "Pedro Martinez", 650.00, 36, Genero.HOMBRE);
        Empleado emp6 = new Empleado(6, "Ana Ortiz", 480.00, 24, Genero.MUJER);
        Empleado emp7 = new Empleado(7, "Jorge Fernandez", 800.00, 45, Genero.HOMBRE);
        Empleado emp8 = new Empleado(8, "Laura Torres", 550.00, 28, Genero.MUJER);
        Empleado emp9 = new Empleado(9, "Miguel Gonzalez", 700.00, 39, Genero.HOMBRE);
        Empleado emp10 = new Empleado(10, "Lucia Hernandez", 520.00, 27, Genero.MUJER);
        Empleado emp11 = new Empleado(11, "Oscar Perez", 600.00, 33, Genero.HOMBRE);
        Empleado emp12 = new Empleado(12, "Carmen Garcia", 450.00, 23, Genero.MUJER);
        Empleado emp13 = new Empleado(13, "Fernando Rodriguez", 850.00, 48, Genero.HOMBRE);
        Empleado emp14 = new Empleado(14, "Isabel Martinez", 570.00, 31, Genero.MUJER);
        Empleado emp15 = new Empleado(15, "Ruben Sanchez", 680.00, 37, Genero.HOMBRE);
        Empleado emp16 = new Empleado(16, "Elena Ortiz", 500.00, 25, Genero.MUJER);
        Empleado emp17 = new Empleado(17, "Ramon Fernandez", 900.00, 50, Genero.HOMBRE);
        Empleado emp18 = new Empleado(18, "Lorena Torres", 600.00, 30, Genero.MUJER);
        Empleado emp19 = new Empleado(19, "Antonio Gonzalez", 750.00, 40, Genero.HOMBRE);
        Empleado emp20 = new Empleado(20, "Sofia Hernandez", 540.00, 26, Genero.MUJER);
        Empleado emp21 = new Empleado(21, "Hector Perez", 620.00, 34, Genero.HOMBRE);
        Empleado emp22 = new Empleado(22, "Raquel Garcia", 480.00, 22, Genero.MUJER);
        Empleado emp23 = new Empleado(23, "Pablo Rodriguez", 800.00, 43, Genero.HOMBRE);
        Empleado emp24 = new Empleado(24, "Natalia Martinez", 560.00, 29, Genero.MUJER);
        Empleado emp25 = new Empleado(25, "Luis Fernandez", 700.00, 38, Genero.HOMBRE);
        Empleado emp26 = new Empleado(26, "Sara Ortiz", 510.00, 27, Genero.MUJER);
        Empleado emp27 = new Empleado(27, "Andres Fernandez", 850.00, 46, Genero.HOMBRE);
        Empleado emp28 = new Empleado(28, "Claudia Torres", 590.00, 32, Genero.MUJER);
        Empleado emp29 = new Empleado(29, "Manuel Gonzalez", 720.00, 37, Genero.HOMBRE);
        Empleado emp30 = new Empleado(30, "Ana Maria Hernandez", 530.00, 25, Genero.MUJER);
        Empleado emp31 = new Empleado(31, "David Perez", 610.00, 33, Genero.HOMBRE);
        Empleado emp32 = new Empleado(32, "Eva Garcia", 470.00, 21, Genero.MUJER);
        Empleado emp33 = new Empleado(33, "Mariano Rodriguez", 820.00, 44, Genero.HOMBRE);
        Empleado emp34 = new Empleado(34, "Teresa Martinez", 550.00, 30, Genero.MUJER);

        return Arrays.asList(
                emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
                emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,
                emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
                emp31, emp32, emp33, emp34
        );

    }

}
