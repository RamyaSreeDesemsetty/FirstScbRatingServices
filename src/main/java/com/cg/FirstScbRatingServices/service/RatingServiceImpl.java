package com.cg.FirstScbRatingServices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.FirstScbRatingServices.entity.Ratings;
import com.cg.FirstScbRatingServices.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	private RatingRepository ratingRepository;

	/*
	 * @Override public Ratings create(Ratings rating) { return
	 * ratingRepository.save(rating); }
	 */
	public Ratings create(Ratings rating) {
		try {
			return ratingRepository.save(rating);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to create rating", e);
		}
	}

	@Override
	public List<Ratings> getAllRating() {
		return (List<Ratings>) ratingRepository.findAll();
	}

	@Override
	public Optional<Ratings> getRatingById(Long ratingId) {
		return ratingRepository.findById(ratingId);
	}

	@Override
	public List<Ratings> getRatingByUserId(Long userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Ratings> getRatingByHotelId(Long hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}
}
