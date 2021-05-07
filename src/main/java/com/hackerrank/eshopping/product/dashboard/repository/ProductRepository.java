package com.hackerrank.eshopping.product.dashboard.repository;

import com.hackerrank.eshopping.product.dashboard.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data SQL repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategoryOrderByAvailabilityDescDiscountedPriceAscIdAsc(String category);
    List<Product> findByCategoryAndAvailabilityOrderByDiscountedPriceAscIdAsc(String category, Boolean availability);
//    findByCategoryAndAvailabilityOrderByDiscountPercentageDescDiscountedPriceAscIdAsc
    List<Product> findAllByOrderByIdAsc();
}
