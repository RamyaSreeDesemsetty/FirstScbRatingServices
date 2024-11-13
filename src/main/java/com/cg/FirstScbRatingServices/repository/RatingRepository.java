package com.cg.FirstScbRatingServices.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.FirstScbRatingServices.entity.Ratings;

public interface RatingRepository extends CrudRepository<Ratings, Long> {
	List<Ratings> findByUserId(Long userId);

	List<Ratings> findByHotelId(Long hotelId);
}