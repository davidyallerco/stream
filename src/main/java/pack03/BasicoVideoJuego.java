
package pack03;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicoVideoJuego {
    
    private String nombre;
    private Double precio;
    private Consola consola;

    public BasicoVideoJuego() {
    }

    public BasicoVideoJuego(String nombre, Double precio, Consola consola) {
        this.nombre = nombre;
        this.precio = precio;
        this.consola = consola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
        return "BasicoVideoJuego{" + "nombre=" + nombre + ", precio=" + precio + ", consola=" + consola + '}';
    }
    
    
}
