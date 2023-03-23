package com.pragma.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Esta anotación se usa a nivel de clase.
// La anotación @RestController marca la clase como un controlador donde cada método devuelve un objeto de dominio
@RequestMapping("/saludar")
public class HelloWorldController {
    @GetMapping("/hola")
    // Esta anotación se utiliza para asignar solicitudes HTTP GET a métodos de controlador específicos.
    // @GetMapping es una anotación compuesta que actúa como un acceso directo para @RequestMapping (method = RequestMethod.GET
    public String saludar () {
        return "Don't Stop to Learning";
    }
}