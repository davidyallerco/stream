package pack12operacionesTerminales;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import pack11maxmin.Empleado;

/**
 *
 * 
 */
public class ejemplo06Reduccion {
    
    public static void main(String[] args) {

        Path path = Paths.get("archivoejemplo.txt");
        String texto = "";
        try (Stream<String> lineas = Files.lines(path)){
           texto = lineas.map(linea -> linea.replace(", ", ""))
                    .reduce("", (linea1, linea2)-> linea1.concat("\n").concat(linea2));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivoejemplo2.txt"))){
            bw.write(texto);
        } catch (IOException ex) {
              ex.printStackTrace();
        }
    }

}
//el resultado puedes ver el explorado java en Files, no es necesario que crees el archvo 2