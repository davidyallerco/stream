
package pack03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import lombok.Builder;
import lombok.Data;




@Data
@Builder
public class VideoJuego {
    
    private String nombre;
    private Double precio;
    private Consola consola;
    private List<Review> reviews;
    private String sitioWebOficial;
    private Boolean tieneDescuento;
    private Integer totalVendido;

   

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("No puedes escribir valores como JSON");
        }
    }
    
    
}
