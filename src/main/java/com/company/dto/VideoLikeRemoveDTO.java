package com.company.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class VideoLikeRemoveDTO {
    @NotEmpty(message = "Video shouldn't be empty")
    private String videoId;
    @NotNull(message = "Profile shouldn't be empty")
    private Integer profileId;
}
