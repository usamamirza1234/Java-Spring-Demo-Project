package com.university.fhdortmund.service;

import com.university.fhdortmund.dto.ReviewDto;
import com.university.fhdortmund.models.Review;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAllReviews();

    Review saveReview(Review review);
}
