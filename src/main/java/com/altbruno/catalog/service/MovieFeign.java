package com.altbruno.catalog.service;

import com.altbruno.catalog.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieFeign {
	@RequestMapping(method = RequestMethod.GET, value = "/movies/{genre}")
	List<MovieDTO> findByGenre(@PathVariable String genre);
}
