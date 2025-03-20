package mx.unam.aragon.ico.te.webautos.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Se utiliza un patron de dise -> Inyeccion de Dependencias
public class ControladorMain {
    @GetMapping("/")
    public String getHome(){
        return "home";
    }

    @GetMapping("/catalogo/")
    public String getCatalogoAutos(){
        return "catalogoautos";
    }

    @GetMapping("/altaauto/")
    public String getAltaAuto(){
        return "alta";
    }
    @PostMapping("/ejecutarAlta/")
    public String ejecutarAlta(@RequestBody Auto auto){
    }
}
