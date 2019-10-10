package ada.septimaback.springbootdemo.persistence;

import ada.septimaback.springbootdemo.model.Mascota;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class MascotaStorage {
    private ObjectMapper objectMapper;

    //public MascotaStorage(){ }

    /*String jsonString = "{ \"dueño\" : \"name\", \"edad\" : \"tipo\" }";
    Mascota mascota = objectMapper.readValue(jsonString, Mascota.class);*/

    public MascotaStorage(ObjectMapper objectMapper) {
        this.objectMapper=objectMapper;
    }

    public List<Mascota> mascotas(){
        try {
            return objectMapper.readValue(
                    new File("/home/yaz/Descargas/springboot-demo/src/main/resources/mascota.json"),
                    new TypeReference<List<Mascota>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } }
  /*  public void pasarMascotasAJson(List<Mascota> list){
        try {
            objectMapper.writeValue(new File("home/yaz/Descargas/springboot-demo/src/main/resources/mascota.json"), list);
            String mascotitasAsString = objectMapper.writeValueAsString(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } */
    public void agregarMascotaNueva (List <Mascota> mascotitas){

        try {
            objectMapper.writeValue(
                    new File("src/main/resources/mascota.json"), mascotitas);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
    /*public void unirMascotar(Mascota mascota){
        try{
            objectMapper.
        }*/
