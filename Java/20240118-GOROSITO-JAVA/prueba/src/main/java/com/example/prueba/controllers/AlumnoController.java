package com.example.prueba.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.models.Alumno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class AlumnoController {

	// Esto se debe traer desde la base de datos. Esta hardcodeado
	List<Alumno> alumnos = new ArrayList<Alumno>(List.of(new Alumno(1, "Romina", "GOnzalez", 8.7),
			new Alumno(2, "Laura", "Acosta", 2.6), new Alumno(3, "Roberto", "Perez", 7)));

	@GetMapping("/alumnos")
	public List<Alumno> getAlumnos() {
		return this.alumnos;

	}

	@GetMapping("/alumnos/{id}") // [GET] localhost:8080/alumnos/2
	public Alumno getAlumnoById(@PathVariable int id) {
		// buscar el alumno que tiene ese id
		for (Alumno alumno : alumnos) {
			if (alumno.getId() == id) {
				return alumno;
			}
		}
		return null;
	}

	@DeleteMapping("/alumnos/{id}")
	public String deleteAlumnoById(@PathVariable int id) {
		for(Alumno alumno:alumnos) {
			if(alumno.getId() == id) {
			alumnos.remove(alumno);
			return "Alumno eliminado con exito";
			}
		}
		
		return "No se encontró el alumno";
	}
	
	@PostMapping("/alumnos")
	public String postAlumno(@RequestBody Alumno nuevoAlumno) {
		alumnos.add(nuevoAlumno);
		
		return "Alumno "+nuevoAlumno.getNombre()+"fue agregado con exito";
	}
	
	@PutMapping("alumnos/{id}")
	public String putAlumno(@PathVariable int id, @RequestBody Alumno putAlumno) {
		for(Alumno alumno:alumnos) {
			if(alumno.getId()==id) {
				alumno.setNombre(putAlumno.getNombre());
				alumno.setApellido(putAlumno.getApellido());
				alumno.setNota(putAlumno.getNota());
				return "Alumno "+alumno.getId()+" fue actualizado";
			}
		}
		
		return "No se encontró el alumno con ese id";
	}
	
}