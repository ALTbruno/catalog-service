package com.altbruno.catalog.dto;

import lombok.Data;

import java.util.List;

@Data
public class SeasonDTO {
	private Integer id;
	private Integer seasonNumber;
	private List<ChapterDTO> chapters;
}
