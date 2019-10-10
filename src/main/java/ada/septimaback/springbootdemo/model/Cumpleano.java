package ada.septimaback.springbootdemo.model;

import java.io.Serializable;

public class Cumpleano implements Serializable {
    private String name;
    private String mes;
    private Integer dia;

    public Cumpleano(){}

    public Cumpleano(String name, String mes, Integer dia){
        this.name=name;
        this.mes=mes;
        this.dia=dia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }}
