package com.altbruno.catalog.controller;

import com.altbruno.catalog.dto.GenreDTO;
import com.altbruno.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@Autowired
	private CatalogService catalogService;

	@GetMapping("/{genre}")
	public ResponseEntity<GenreDTO> listarPorGenero(@PathVariable String genre) {
		return ResponseEntity.status(HttpStatus.OK).body(catalogService.findByGenre(genre));
	}
}
