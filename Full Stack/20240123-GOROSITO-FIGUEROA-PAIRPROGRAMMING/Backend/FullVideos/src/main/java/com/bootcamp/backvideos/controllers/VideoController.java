package com.bootcamp.backvideos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.backvideos.models.Video;
import com.bootcamp.backvideos.services.VideoService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/videos")
public class VideoController {
	
	@Autowired
	VideoService videoService;
	
	@GetMapping()
	public ResponseEntity<List<Video>> getVideos() {
		return ResponseEntity.ok(videoService.obtenerVideo());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getVideoById(@PathVariable Integer id) {
		// public ResponseEntity<Optional<TareaModel>> getTareaById(@PathVariable
		// Integer id) {
		// return ResponseEntity.ok(null);
		Optional<Video> VideoOptional = videoService.obtenerVideoById(id);
		

		if (VideoOptional.isPresent()) {
			int likes =VideoOptional.get().getLikes();
			int dislikes = VideoOptional.get().getDislikes();
			double promedio =(double) likes/(dislikes+likes)*10;
			
			VideoOptional.get().setRating(promedio);
			return ResponseEntity.ok(VideoOptional.get());
		} else {
			return ResponseEntity.notFound().build();
		}

		// return ResponseEntity.ok(tareaService.obtenerTareaById(id));
	}
	@GetMapping("/byCategory/{category}")
    public ResponseEntity<List<Video>> getVideoByCategory(@PathVariable String category) {
        return  ResponseEntity.ok(videoService.getVideoByCategory(category));
    }
	
	@PostMapping()
	public ResponseEntity<String> createVideo(@RequestBody Video video) {

		return ResponseEntity.ok(videoService.crearVideo(video));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteVideo(@PathVariable Integer id) {
		return ResponseEntity.ok(videoService.eliminarVideo(id));
		/*
		 * try { eliminar retorno ok }
		 * catch(Exception err) { return err }
		 */
	}
	
}
