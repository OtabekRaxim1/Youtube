package com.company.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class VideoLikeCreateDTO {
    @NotEmpty(message = "Video shouldn't be empty")
    private String videoId;
    @NotNull(message = "Profile shouldn't be empty")
    private Integer profileId;
}
