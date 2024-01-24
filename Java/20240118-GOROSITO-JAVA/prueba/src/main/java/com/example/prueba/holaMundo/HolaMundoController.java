package com.example.prueba.holaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
	//El controlador entiende las peticiones que hace un cliente
	//Significa que necesitamos : URL, Metodo y opcionalmente Datos
	
	@GetMapping("/saludo/{name}") //localhost:8080/saludo/Pepe [GET]
	public String holaMundo(@PathVariable String name) {
		return "Hola "+name+" devolve la guita";
	}
}

/*
 -Controllers = maneja la peticion de la API con @RestController
 -Services= Logica de negocio
 -Repositories =  Permite hacer consultas a la base de datos
 -Models = Representacion de la estructura entidad
 */
