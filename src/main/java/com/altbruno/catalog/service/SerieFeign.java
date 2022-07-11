package com.altbruno.catalog.service;

import com.altbruno.catalog.dto.SerieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "serie-service")
public interface SerieFeign {
	@RequestMapping(method = RequestMethod.GET, value = "/series/{genre}")
	List<SerieDTO> findByGenre(@PathVariable String genre);
}
