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
public class ejemplo07Reduccionstatistic {
    
    public static void main(String[] args) {
        System.out.println("Suma: " +
                IntStream.range(1, 20)
                    .summaryStatistics());
                    

        System.out.println("Suma: " +
                IntStream.range(1, 20)
                    .summaryStatistics()
                    .getSum());
        
        System.out.println("Promedio: " +
                IntStream.range(1, 20)
                    .summaryStatistics()
                    .getAverage());
    }

}
