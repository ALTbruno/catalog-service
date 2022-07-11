package com.altbruno.catalog.dto;

import lombok.Data;

import java.util.List;

@Data
public class SerieDTO {
	private Integer id;
	private String name;
	private String genre;
	private List<SeasonDTO> seasons;
}
