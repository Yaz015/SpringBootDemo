package ada.septimaback.springbootdemo.controller;

import ada.septimaback.springbootdemo.model.Mascota;
import ada.septimaback.springbootdemo.service.MascotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    private MascotaService mascotaService;
    public MascotaController(MascotaService mascotaService){this.mascotaService=mascotaService;}

    @GetMapping("/mascotas")
    public List<Mascota> mascotas(@RequestParam(value="tipo", required=false) String tipo){
        return mascotaService.mascotas(tipo);}

    @PostMapping ("/mascotas")
    public Mascota addMascota(@RequestBody Mascota mascota){
        return
        mascotaService.agregarMascota(mascota);}
    }
    //@PatchMapping ("Mascotas")
    //public List<Mascota> cambiarEdad(@RequestParam


