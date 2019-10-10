package ada.septimaback.springbootdemo.persistence;

import ada.septimaback.springbootdemo.model.Cumpleano;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class CumpleanoStorage {
    private ObjectMapper objectMapper;

    public CumpleanoStorage(ObjectMapper objectMapper){
        this.objectMapper=objectMapper;
    }

    public List<Cumpleano>cumpleanos(){
        try {
            return objectMapper.readValue(
              new File("/home/yaz/Descargas/springboot-demo/src/main/resources/cumpleano.json"),
              new TypeReference<List<Cumpleano>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
