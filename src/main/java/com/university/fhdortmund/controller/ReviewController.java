package com.university.fhdortmund.controller;


import com.university.fhdortmund.dto.ReviewDto;
import com.university.fhdortmund.models.Review;
import com.university.fhdortmund.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReviewController {
    private ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public String listRatings(Model model){
        List<ReviewDto> reviews = reviewService.getAllReviews(); // Corrected variable name to "reviews"
        model.addAttribute("reviews", reviews); // Corrected attribute name to "reviews"
        return "reviews-list";
    }

    @GetMapping("/reviews/new")
    public String createReviewForm(Model model){
        Review review = new Review();
        model.addAttribute("review", review);
        return "reviews-create";
    }

    @PostMapping("/reviews/new")
    public String saveReview(@ModelAttribute("review") Review review){
       reviewService.saveReview(review);
        return "redirect:/reviews";
    }
}
