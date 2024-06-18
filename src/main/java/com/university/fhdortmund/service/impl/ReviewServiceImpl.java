package com.university.fhdortmund.service.impl;

import com.university.fhdortmund.dto.ReviewDto;
import com.university.fhdortmund.models.Review;
import com.university.fhdortmund.repository.ReviewRepository;
import com.university.fhdortmund.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<ReviewDto> getAllReviews() {
        List<Review> reviews = reviewRepository.findAll();
        return reviews.stream()
                .map(review -> mapToReviewDto(review))
                .collect(Collectors.toList());
    }

    private ReviewDto mapToReviewDto(Review review) {
        return ReviewDto.builder()
                .reviewId(review.getReviewId())
                .reviewerId(review.getReviewerId())
                .rating(review.getRating())
                .vehicleBookingId(review.getVehicleBookingId())
                .createdOn(review.getCreatedOn())
                .updatedOn(review.getUpdatedOn())
                .build();
    }
}
