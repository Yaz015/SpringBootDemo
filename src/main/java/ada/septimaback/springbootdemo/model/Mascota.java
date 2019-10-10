package ada.septimaback.springbootdemo.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class Mascota implements Serializable {

    private Integer id;
    private String dueno;
    private String name;
    private Integer edad;
    private String tipo;

    public Mascota(){}

    public Mascota(Integer id, String dueno, String name, Integer edad, String tipo) {
        this.id= id;
        this.dueno = dueno;
        this.name = name;
        this.edad = edad;
        this.tipo = tipo;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno=dueno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
