package com.altbruno.catalog.service;

import com.altbruno.catalog.dto.GenreDTO;
import com.altbruno.catalog.dto.MovieDTO;
import com.altbruno.catalog.dto.SerieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

	@Autowired
	private MovieFeign movieFeign;

	@Autowired
	private SerieFeign serieFeign;

	public GenreDTO findByGenre(String genre) {
		List<MovieDTO> movies = movieFeign.findByGenre(genre);
		List<SerieDTO> series = serieFeign.findByGenre(genre);
		GenreDTO genreDTO = new GenreDTO();
		genreDTO.setGenre(genre);
		genreDTO.setMovies(movies);
		genreDTO.setSeries(series);
		return genreDTO;
	}
}
