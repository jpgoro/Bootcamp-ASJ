package com.bootcamp.backvideos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.backvideos.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {
	List<Video> findByCategory(String category);
}
