package com.cg.FirstScbRatingServices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "micro_ratings")
public class Ratings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ratingId;

	private Long userId;

	private Long hotelId;

	private int rating;

	private String feedback;

	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ratings(Long ratingId, Long userId, Long hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}

	public Long getRatingId() {
		return ratingId;
	}

	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Ratings [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+ ", feedback=" + feedback + "]";
	}

}
