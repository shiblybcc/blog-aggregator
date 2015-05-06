package cz.jiripinkas.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jiripinkas.jba.entity.Rating;
import cz.jiripinkas.jba.entity.User;

public interface RatingRepository extends JpaRepository<Rating, Integer>{

}
