package com.example.myproject1.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
public class EventDto {

    Long id;
    @NotEmpty(message = "Event name should not be empty!")
    String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    LocalDateTime startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    LocalDateTime endTime;
    @NotEmpty(message = "Event type should not be empty!")
    String type;
    private String photoUrl;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
