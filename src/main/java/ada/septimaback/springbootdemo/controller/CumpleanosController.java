package ada.septimaback.springbootdemo.controller;

import ada.septimaback.springbootdemo.model.Cumpleano;
import ada.septimaback.springbootdemo.service.CumpleanosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CumpleanosController {
    private CumpleanosService cumpleanosService;

    public CumpleanosController(CumpleanosService cumpleanosService){
        this.cumpleanosService = cumpleanosService;
    }

    @GetMapping("/cumpleano")
    public List<Cumpleano> cumpleanos (@RequestParam(value="mes", required=false) String mes) {
        return cumpleanosService.cumpleanos(mes);
    }

}
