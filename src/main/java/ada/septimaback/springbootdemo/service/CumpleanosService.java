package ada.septimaback.springbootdemo.service;

import ada.septimaback.springbootdemo.model.Cumpleano;
import org.springframework.stereotype.Service;
import ada.septimaback.springbootdemo.persistence.CumpleanoStorage;

import java.util.List;
import java.util.stream.Collectors;


  @Service
  public class CumpleanosService {

    private List<Cumpleano> cumpleanos;
    public CumpleanoStorage cumpleanoStorage;


    public CumpleanosService(CumpleanoStorage cumpleanoStorage){
        this.cumpleanoStorage=cumpleanoStorage;}

    public List<Cumpleano> cumpleanos(String mes) {
        cumpleanos= cumpleanoStorage.cumpleanos();

        if (mes==null){
            return cumpleanos;
        } else {
        return cumpleanos.stream().filter(c->c.getMes().equals(mes)).collect(Collectors.toList());

    }}

}
