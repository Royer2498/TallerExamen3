package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

    @Query(value = "select p.id, p.text ,p.text ,p.score,p.likes,p.user, p.restaurant, count(p.count) as count from Comment p group by p.user")
    Iterable<Restaurant> findComments();
}
