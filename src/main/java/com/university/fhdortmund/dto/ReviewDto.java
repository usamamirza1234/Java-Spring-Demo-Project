package com.university.fhdortmund.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Builder

public class ReviewDto {
    private Long reviewId;
    private Long reviewerId;
    private Long vehicleBookingId;
    private String rating;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

}
