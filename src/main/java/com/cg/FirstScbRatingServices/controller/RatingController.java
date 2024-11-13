package com.cg.FirstScbRatingServices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.FirstScbRatingServices.entity.Ratings;
import com.cg.FirstScbRatingServices.service.RatingServiceImpl;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	@Autowired
	private RatingServiceImpl ratingServiceImpl;
	/*
	 * @PostMapping("/create") public ResponseEntity<Ratings>
	 * createRating(@RequestBody Ratings rating) { Ratings createdRating =
	 * ratingServiceImpl.create(rating); return new ResponseEntity<>(createdRating,
	 * HttpStatus.CREATED); }
	 */

	@PostMapping("/create")
	public ResponseEntity<Ratings> createRating(@RequestBody Ratings rating) {
		try {
			Ratings createdRating = ratingServiceImpl.create(rating);
			return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Ratings>> getAllRatings() {
		List<Ratings> ratings = ratingServiceImpl.getAllRating();
		return new ResponseEntity<>(ratings, HttpStatus.OK);
	}

	@GetMapping("/getById/{ratingId}")
	public ResponseEntity<Ratings> getRatingById(@PathVariable Long ratingId) {
		Optional<Ratings> rating = ratingServiceImpl.getRatingById(ratingId);
		if (rating.isPresent()) {
			return new ResponseEntity<>(rating.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/getByUserId/{userId}")
	public ResponseEntity<List<Ratings>> getRatingsByUserId(@PathVariable Long userId) {
		List<Ratings> ratings = ratingServiceImpl.getRatingByUserId(userId);
		return new ResponseEntity<>(ratings, HttpStatus.OK);
	}

	@GetMapping("/getByHotelId/{hotelId}")
	public ResponseEntity<List<Ratings>> getRatingsByHotelId(@PathVariable Long hotelId) {
		List<Ratings> ratings = ratingServiceImpl.getRatingByHotelId(hotelId);
		return new ResponseEntity<>(ratings, HttpStatus.OK);
	}
}
