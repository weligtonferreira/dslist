package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imageUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imageUrl = entity.getImageUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
