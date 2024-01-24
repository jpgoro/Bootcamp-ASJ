package com.bootcamp.backvideos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.backvideos.models.Video;
import com.bootcamp.backvideos.repositories.VideoRepository;

@Service
public class VideoService {
	
	@Autowired 
	VideoRepository videoRepository;
	
	public List<Video> obtenerVideo() {
		return videoRepository.findAll(); 
	}
	
	public Optional<Video> obtenerVideoById(int id) {
		return videoRepository.findById(id);
	}
	
	public List<Video> getVideoByCategory(String category) {
        return videoRepository.findByCategory(category);
    }
	
	public String crearVideo(Video video) {
		videoRepository.save(video);
		return "Video creado correctamente";
	}
	
	public String eliminarVideo(int id) {
		videoRepository.deleteById(id);
		return "Video eliminado correctamente";
	}
	
	
}
