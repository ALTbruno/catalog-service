package com.altbruno.catalog.dto;

import lombok.Data;

import java.util.List;

@Data
public class GenreDTO {
	private String genre;
	private List<MovieDTO> movies;
}
