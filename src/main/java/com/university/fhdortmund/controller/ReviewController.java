package com.university.fhdortmund.controller;


import com.university.fhdortmund.dto.ReviewDto;
import com.university.fhdortmund.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
