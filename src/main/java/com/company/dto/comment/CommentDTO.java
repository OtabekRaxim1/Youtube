package com.company.dto.comment;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentDTO {
    private Integer id;

    private String content;

    private Integer profileId;

    private Integer commentId;

    private String videoId;

    private Boolean visible;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

}
