package com.university.fhdortmund.repository;

import com.university.fhdortmund.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Optional<Review> findByRating(String rating); // Corrected method name to match Java naming conventions

    // Example of using @Query annotation for custom query
    @Query("SELECT r FROM Review r WHERE r.rating = :rating")
    Optional<Review> findByTitleUsingQuery(@Param("rating") String rating);

}

