package com.cg.FirstScbRatingServices.service;

import java.util.List;
import java.util.Optional;

import com.cg.FirstScbRatingServices.entity.Ratings;

public interface RatingService {
	Ratings create(Ratings rating);

	List<Ratings> getAllRating();

	Optional<Ratings> getRatingById(Long ratingId);

	List<Ratings> getRatingByUserId(Long userId);

	List<Ratings> getRatingByHotelId(Long hotelId);
}
