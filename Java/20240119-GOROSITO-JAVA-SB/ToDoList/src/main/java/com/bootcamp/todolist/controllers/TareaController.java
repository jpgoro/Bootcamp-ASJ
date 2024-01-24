package com.bootcamp.todolist.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.todolist.models.TareaModel;
import com.bootcamp.todolist.services.TareaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/tareas")
public class TareaController {

	@Autowired
	TareaService tareaService;

	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		// return new ResponseEntity<>("hola Mundo",HttpStatus.CREATED);
		return ResponseEntity.ok("algo");
	}

	@GetMapping()
	public ResponseEntity<List<TareaModel>> getTareas() {
		return ResponseEntity.ok(tareaService.obtenerTareas());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getTareaById(@PathVariable Integer id) {
		// public ResponseEntity<Optional<TareaModel>> getTareaById(@PathVariable
		// Integer id) {
		// return ResponseEntity.ok(null);
		Optional<TareaModel> tareaOptional = tareaService.obtenerTareaById(id);

		if (tareaOptional.isPresent()) {
			return ResponseEntity.ok(tareaOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}

		// return ResponseEntity.ok(tareaService.obtenerTareaById(id));
	}

	@PostMapping()
	public ResponseEntity<String> createTarea(@RequestBody TareaModel tarea) {

		return ResponseEntity.ok(tareaService.crearTarea(tarea));
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateTareaById(@PathVariable Integer id, @RequestBody TareaModel tarea) {

		return ResponseEntity.ok(tareaService.modificarTarea(id, tarea));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTarea(@PathVariable Integer id) {
		return ResponseEntity.ok(tareaService.eliminarTarea(id));
		/*
		 * try { eliminar retorno ok }
		 * catch(Exception err) { return err }
		 */
	}

}
