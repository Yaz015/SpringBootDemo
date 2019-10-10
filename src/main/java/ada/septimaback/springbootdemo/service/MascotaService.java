package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Mascota;
import ada.septimaback.springbootdemo.persistence.MascotaStorage;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MascotaService {

    public MascotaStorage mascotaStorage;
    public List<Mascota> mascotas; /* = new ArrayList<>(Arrays.asList(
            new Mascota(1,"Yaz", "Matt", 2, "gato"),
            new Mascota(2,"Nadia", "Toribio", 2, "Gato"),
            new Mascota(3,"Roberto", "Robert", 3, "perro")));*/

    public MascotaService(MascotaStorage mascotaStorage){
        this.mascotaStorage=mascotaStorage;}

    public List<Mascota> mascotas(String tipo) {
        mascotas= mascotaStorage.mascotas();
        if (tipo == null) {
            return mascotas;
        } else {
            return mascotas.stream().filter(m -> m.getTipo().equals(tipo)).collect(Collectors.toList());
        }
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public Mascota agregarMascota(Mascota nuevaMascota){
        long count = mascotas.stream().count();
        int i=mascotas.stream().skip(count - 1).findFirst().get().getId();
        nuevaMascota.setId(i+1);
        getMascotas().add(nuevaMascota);
        this.mascotaStorage.agregarMascotaNueva(mascotas);
        return nuevaMascota;
    }
}

