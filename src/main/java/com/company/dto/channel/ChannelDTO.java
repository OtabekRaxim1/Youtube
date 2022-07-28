package com.company.dto.channel;

import com.company.dto.AttachDTO;
import com.company.enums.ChannelStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChannelDTO {
    private String id;
    private String name;
    private String photoId;
    private String photoUrl;
    private AttachDTO photo;
    private String bannerId;
    private Integer profileId;
    private String telegramUrl;
    private String instagramUrl;
    private String websiteUrl;
    private ChannelStatus status;
    private Boolean visible;
    private LocalDateTime createdDate;
}
